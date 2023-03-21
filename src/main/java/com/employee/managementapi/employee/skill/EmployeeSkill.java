package com.employee.managementapi.employee.skill;

import com.employee.managementapi.skill.database.DatabaseSkillList;
import com.employee.managementapi.skill.framework.FrameworkSkillList;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkillList;
import com.employee.managementapi.skill.programming.ProgrammingSkillList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 社員スキル
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeSkill {
	private ProgrammingSkillList programmingSkillList;
	private FrameworkSkillList frameworkSkillList;
	private DatabaseSkillList databaseSkillList;
	private InfrastructureSkillList infrastructureSkillList;
}
