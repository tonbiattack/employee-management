package com.employee.managementapi.security;

import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.employee.managementapi.exception.BadRequestException;

@Service
public class AccountUserDetailsService implements UserDetailsService {

	@Autowired
	private AccountMapper accountMapper;

	@Autowired
	private MessageSource messageSource;

	@Override
	public UserDetails loadUserByUsername(String companyEmail) throws UsernameNotFoundException {
		//メールアドレスに紐づくアカウントを探す。
		Account account = accountMapper.selectByEmail(companyEmail);
		if (account == null) {
			throw new BadRequestException(
					messageSource.getMessage("not.registered", new Object[] { "メールアドレス:" + companyEmail },
							Locale.getDefault()));
		}
		//一つのメールアドレスに複数の権限が紐づくことがある
		Collection<GrantedAuthority> authorities = account.getRoleNameList().stream()
				.map(i -> new SimpleGrantedAuthority(i.getRoleName()))
				.collect(Collectors.toList());

		return new AccountUserDetails(account, authorities);
	}
}
