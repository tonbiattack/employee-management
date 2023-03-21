package com.employee.managementapi.employee.skill.programming;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社員プログラミングスキル
 */
@AllArgsConstructor
@Getter
@ApiModel(description = "社員プログラミングスキル")
public class EmployeeProgrammingSkill {
	@NotNull
	@ApiModelProperty(value = "社員ID", example = "1")
	private final int employeeId;

	@NotNull
	@ApiModelProperty(value = "社員保持プログラミングスキルID", example = "1")
	private final int employeeProgrammingSkillId;

	@NotBlank
	@ApiModelProperty(value = "社員コード", example = "56001")
	private final String employeeCode;

	@NotBlank
	@ApiModelProperty(value = "プログラミングスキル名", example = "C言語")
	private final String programmingSkillName;

	@ApiModelProperty(value = "スキルレベル", example = "3")
	@NotNull
	@Range(min = 1, max = 10)
	private final int skillLevel;
}
