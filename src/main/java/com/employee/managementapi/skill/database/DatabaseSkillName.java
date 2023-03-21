package com.employee.managementapi.skill.database;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * データベーススキル名
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "データベーススキル名")
public class DatabaseSkillName {
	@ApiModelProperty(value = "データベーススキル名", example = "Microsoft SQL Server")
	@NotBlank
	@Size(max = 20)
	private String databaseSkillName;

	public DatabaseSkillNameWithPrimaryKey toDatabaseSkillNameWithPrimaryKey(int databaseSkillId) {
		return DatabaseSkillNameWithPrimaryKey.builder()
				.databaseSkillId(databaseSkillId)
				.databaseSkillName(databaseSkillName)
				.build();
	}
}
