package com.employee.managementapi.employee.skill.database;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.exception.NotFoundException;

import lombok.RequiredArgsConstructor;

@Transactional(rollbackFor = Exception.class)
@Service
@RequiredArgsConstructor
public class EmployeeDatabaseSkillUpdateServiceImpl implements EmployeeDatabaseSkillUpdateService {

	private final MessageSource messageSource;

	private final EmployeeDatabaseSkillMapper employeeDatabaseSkillMapper;

	@Override
	public EmployeeDatabaseSkill update(EmployeeDatabaseSkill employeeDatabaseSkill) {
		employeeDatabaseSkillMapper.update(employeeDatabaseSkill);
		return employeeDatabaseSkill;
	}

	@Override
	public void delete(int employeeDatabaseSkillId) {
		int deleteResult = employeeDatabaseSkillMapper.delete(employeeDatabaseSkillId);
		if (deleteResult == 0) {
			throw new NotFoundException(
					messageSource.getMessage("delete.resource.does.not.exist",
							new Object[] {}, Locale.getDefault()));
		}
	}

}
