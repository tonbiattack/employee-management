package com.employee.managementapi.employee.skill.infrastructure;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社員インフラスキル
 */
@AllArgsConstructor
@Getter
@ApiModel(description = "社員インフラスキル")
public class EmployeeInfrastructureSkill {
	@NotNull
	@ApiModelProperty(value = "社員ID", example = "1")
	private final int employeeId;

	@NotNull
	@ApiModelProperty(value = "社員保持インフラスキルID", example = "1")
	private final int employeeInfrastructureSkillId;

	@NotBlank
	@ApiModelProperty(value = "社員コード", example = "56001")
	private final String employeeCode;

	@NotBlank
	@ApiModelProperty(value = "インフラスキル名", example = "AWS")
	private final String infrastructureSkillName;
	@Range(min = 1, max = 10)

	@ApiModelProperty(value = "スキルレベル", example = "6")
	@NotNull
	@Range(min = 1, max = 10)
	private final int skillLevel;
}
