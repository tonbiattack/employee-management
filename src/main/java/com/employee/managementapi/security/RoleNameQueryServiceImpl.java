package com.employee.managementapi.security;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleNameQueryServiceImpl implements RoleNameQueryService {

	private final RoleNameMapper roleNameMapper;

	@Override
	public boolean checkExistsRole(RoleName roleName) {
		int existsRoleCount = roleNameMapper.countByRole(roleName);
		if (existsRoleCount != 0) {
			return true;
		}
		return false;
	}

	@Override
	public int getRoleId(RoleName roleName) {
		return roleNameMapper.selectRoleIdByRole(roleName);
	}

}