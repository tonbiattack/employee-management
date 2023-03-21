package com.employee.managementapi.skill.database;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

/**
 * データベーススキル名主キー付き
 */
@Getter
@Builder
@ApiModel(description = "データベーススキル名主キー付き")
public class DatabaseSkillNameWithPrimaryKey {
	@NotNull
	@ApiModelProperty(value = "データベーススキルID", example = "1")
	private final int databaseSkillId;

	@NotBlank
	@Size(max = 20)
	@ApiModelProperty(value = "データベーススキル名", example = "Microsoft SQL Server")
	private final String databaseSkillName;

}
