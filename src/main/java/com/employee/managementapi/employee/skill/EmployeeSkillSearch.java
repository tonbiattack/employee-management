package com.employee.managementapi.employee.skill;

import com.employee.managementapi.employee.EmployeeBasicProfile;
import com.employee.managementapi.skill.database.DatabaseSkillList;
import com.employee.managementapi.skill.framework.FrameworkSkillList;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkillList;
import com.employee.managementapi.skill.programming.ProgrammingSkillList;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社員スキル検索結果
 * レスポンスボディで使用する予定
 * EmployeeSkillのレスポンス
 */
@Getter
@AllArgsConstructor
public class EmployeeSkillSearch {
	private EmployeeBasicProfile employeeBasicProfile;
	private ProgrammingSkillList programmingSkillList;
	private FrameworkSkillList frameworkSkillList;
	private DatabaseSkillList databaseSkillList;
	private InfrastructureSkillList infrastructureSkillList;
}
