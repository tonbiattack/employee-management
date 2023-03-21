package com.employee.managementapi.security;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.OwnershipMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OwnershipQueryServiceImpl implements OwnershipQueryService {

	private final OwnershipMapper ownershipMapper;

	@Override
	public int getIndex() {
		return ownershipMapper.selectNextval();
	}

}
