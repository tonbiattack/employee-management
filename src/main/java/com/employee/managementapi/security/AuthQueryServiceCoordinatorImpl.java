package com.employee.managementapi.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthQueryServiceCoordinatorImpl implements AuthQueryServiceCoordinator {

	private final AuthenticationManager authenticationManager;

	private final JwtTokenProvider tokenProvider;

	@Override
	public JwtAuth authenticateUser(SignInDto signInDto) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(signInDto.getEmail(), signInDto.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		// トークンを取得する
		String token = tokenProvider.generateToken(authentication);

		return new JwtAuth(token);
	}
}
