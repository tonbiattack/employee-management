package com.employee.managementapi.security;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.Password;
import com.employee.managementapi.infrastructure.employee.PasswordMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PasswordUpdateServiceImpl implements PasswordUpdateService {

	private final PasswordMapper passwordMapper;

	@Override
	public Password register(Password password) {
		passwordMapper.insert(password);
		return password;
	}
}
