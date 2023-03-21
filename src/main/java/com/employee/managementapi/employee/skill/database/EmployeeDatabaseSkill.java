package com.employee.managementapi.employee.skill.database;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 社員データベーススキル
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ApiModel(description = "社員データベーススキル")
public class EmployeeDatabaseSkill {
	@NotNull
	@ApiModelProperty(value = "社員ID", example = "1")
	private int employeeId;

	@NotNull
	@ApiModelProperty(value = "社員保持データベーススキルID", example = "1")
	private int employeeDatabaseSkillId;

	@NotBlank
	@ApiModelProperty(value = "社員コード", example = "56001")
	private String employeeCode;

	@NotBlank
	@ApiModelProperty(value = "データベーススキル名", example = "DynamoDB")
	private String databaseSkillName;

	@Range(min = 1, max = 10)
	@ApiModelProperty(value = "スキルレベル", example = "3")
	@NotNull
	private int skillLevel;
}
