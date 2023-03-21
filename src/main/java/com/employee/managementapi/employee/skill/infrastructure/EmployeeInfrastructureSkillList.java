package com.employee.managementapi.employee.skill.infrastructure;

import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * ファーストコレクション社員インフラスキル
 */
@Getter
@ApiModel(description = "社員インフラスキルリスト")
public class EmployeeInfrastructureSkillList {
	@NotBlank
	@ApiModelProperty(value = "社員インフラスキルリスト")
	private final List<EmployeeInfrastructureSkill> employeeInfrastructureSkills;

	EmployeeInfrastructureSkillList(final List<EmployeeInfrastructureSkill> employeeInfrastructureSkills) {
		this.employeeInfrastructureSkills = employeeInfrastructureSkills;
	}

	public int size() {
		return employeeInfrastructureSkills.size();
	}
}
