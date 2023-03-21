package com.employee.managementapi.employee.skill.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeFrameworkSkillQueryServiceImpl implements EmployeeFrameworkSkillQueryService {

	@Autowired
	private final EmployeeFrameworkSkillMapper employeeFrameworkSkillMapper;

	@Override
	public EmployeeFrameworkSkillList getList() {
		return new EmployeeFrameworkSkillList(employeeFrameworkSkillMapper.selectList());
	}
}
