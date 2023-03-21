package com.employee.managementapi.security;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.Ownership;
import com.employee.managementapi.infrastructure.employee.OwnershipMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OwnershipUpdateServiceImpl implements OwnershipUpdateService {

	private final OwnershipMapper ownershipMapper;

	@Override
	public Ownership register(Ownership ownership) {
		ownershipMapper.insert(ownership);
		return ownership;
	}
}
