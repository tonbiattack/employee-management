package com.employee.managementapi.employee.skill.framework;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社員フレームワークスキル
 */
@AllArgsConstructor
@Getter
@ApiModel(description = "社員フレームワークスキル")
public class EmployeeFrameworkSkill {
	@NotNull
	@ApiModelProperty(value = "社員ID", example = "1")
	private final int employeeId;

	@NotNull
	@ApiModelProperty(value = "社員保持フレームワークスキルID", example = "1")
	private final int employeeFrameworkSkillId;

	@NotBlank
	@ApiModelProperty(value = "社員コード", example = "56001")
	private final String employeeCode;

	@NotBlank
	@ApiModelProperty(value = "フレームワークスキル名", example = "Angular")
	private final String frameworkSkillName;

	@ApiModelProperty(value = "スキルレベル", example = "3")
	@NotNull
	@Range(min = 1, max = 10)
	private final int skillLevel;
}
