package com.employee.managementapi.security;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.exception.BadRequestException;
import com.employee.managementapi.infrastructure.employee.Ownership;
import com.employee.managementapi.infrastructure.employee.Password;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthUpdateServiceCoordinatorImpl implements AuthUpdateServiceCoordinator {

	private final PasswordEncoder passwordEncoder;

	private final MessageSource messageSource;

	private final CompanyEmailQueryService companyEmailQueryService;

	private final PasswordUpdateService passwordUpdateService;

	private final PasswordQueryService passwordQueryService;

	private final OwnershipQueryService ownershipQueryService;

	private final OwnershipUpdateService ownershipUpdateService;

	private final RoleNameQueryService roleNameQueryService;

	@Override
	public SignUpDtoWithPrimaryKey registerUser(SignUpDto signUpDto) {
		CompanyEmail companyEmail = signUpDto.toCompanyEmail();
		RoleName roleName = signUpDto.toRoleName();

		//アカウントとして登録しようとしているメールアドレスが会社のメールアドレスとして登録されているのかどうか確認します。
		if (!companyEmailQueryService.checkAlreadyExistsCompanyEmailAsCompanyEmail(companyEmail)) {
			throw new BadRequestException(
					messageSource.getMessage("not.registered", new Object[] { "メールアドレス:" + signUpDto.getCompanyEmail()}, Locale.getDefault()));
		}

		//既に会社メールアドレスがパスワードとして登録されているのかどうか確認します。
		if (!companyEmailQueryService.checkAlreadyExistsEmailAsPassword(companyEmail)) {
			throw new BadRequestException(
					messageSource.getMessage("already.exists", new Object[] { "メールアドレス:" + signUpDto.getCompanyEmail()}, Locale.getDefault()));
		}

		//登録しようとしているロールネームが存在しているのかどうか確認します。
		if (!roleNameQueryService.checkExistsRole(roleName)) {
			throw new BadRequestException(
					messageSource.getMessage("not.exists", new Object[] { "ロール:" + signUpDto.getRoleName() },
							Locale.getDefault()));
		}

		int index = passwordQueryService.getIndex();
		int activeEmployeeContactInformationId = companyEmailQueryService
				.getActiveEmployeeContactInformationId(companyEmail);
				//パスワードハッシュ化
		String encodedPassword = passwordEncoder.encode(signUpDto.getPassword());

		Password password = new Password(index,
				activeEmployeeContactInformationId, encodedPassword);
				//パスワード登録
		Password registeredPassword = passwordUpdateService.register(password);

		int ownershipId = ownershipQueryService.getIndex();
		int roleID = roleNameQueryService.getRoleId(roleName);
		Ownership ownership = new Ownership(ownershipId, registeredPassword.getPasswordId(), roleID);
		//所有権限登録
		Ownership registeredOwnership = ownershipUpdateService.register(ownership);

		return new SignUpDtoWithPrimaryKey(registeredOwnership.getOwnershipId(), registeredPassword.getPasswordId(),
				signUpDto.getCompanyEmail(),
				signUpDto.getPassword(), signUpDto.getRoleName());
	}

}
