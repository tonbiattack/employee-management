package com.employee.managementapi.employee.skill.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeDatabaseSkillQueryServiceImpl implements EmployeeDatabaseSkillQueryService {

	@Autowired
	private final EmployeeDatabaseSkillMapper employeeDatabaseSkillMapper;

	@Override
	public EmployeeDatabaseSkillList getList() {
		return new EmployeeDatabaseSkillList(employeeDatabaseSkillMapper.selectList());
	}
}
