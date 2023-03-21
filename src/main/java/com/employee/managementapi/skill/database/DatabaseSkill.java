package com.employee.managementapi.skill.database;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * データベーススキル
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ApiModel(description = "データベーススキル")
public class DatabaseSkill {
	@ApiModelProperty(value = "データベーススキルID", example = "3")
	@NotNull
	private int databaseSkillId;

	@ApiModelProperty(value = "データベーススキル名", example = "DynamoDB")
	@NotBlank
	@Size(max = 20)
	private String databaseSkillName;

	@ApiModelProperty(value = "スキルレベル", example = "3")
	@Range(min = 1, max = 10)
	@NotNull
	private int skillLevel;
}
