package com.employee.managementapi.security;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.PasswordMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PasswordQueryServiceImpl implements PasswordQueryService {

	private final PasswordMapper passwordMapper;

	@Override
	public int getIndex() {
		return passwordMapper.selectNextval();
	}

}
