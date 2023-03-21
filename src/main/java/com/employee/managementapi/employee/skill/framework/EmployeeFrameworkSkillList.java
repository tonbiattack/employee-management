package com.employee.managementapi.employee.skill.framework;

import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * ファーストコレクション社員フレームワークスキル
 */
@Getter
@ApiModel(description = "社員フレームワークスキルリスト")
public class EmployeeFrameworkSkillList {
	@NotBlank
	@ApiModelProperty(value = "社員フレームワークスキルリスト")
	private final List<EmployeeFrameworkSkill> employeeFrameworkSkills;

	EmployeeFrameworkSkillList(final List<EmployeeFrameworkSkill> employeeFrameworkSkills) {
		this.employeeFrameworkSkills = employeeFrameworkSkills;
	}

	int size() {
		return employeeFrameworkSkills.size();
	}
}
