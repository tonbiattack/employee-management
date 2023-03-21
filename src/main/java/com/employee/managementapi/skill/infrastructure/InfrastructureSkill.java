package com.employee.managementapi.skill.infrastructure;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * インフラスキル
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class InfrastructureSkill {
	@ApiModelProperty(value = "インフラスキルID", example = "3")
	@NotNull
	private int infrastructureSkillId;

	@ApiModelProperty(value = "インフラスキル名", example = "AWS")
	@NotBlank
	@Size(max = 20)
	private String infrastructureSkillName;

	@ApiModelProperty(value = "スキルレベル", example = "3")
	@Range(min = 1, max = 10)
	@NotNull
	private int skillLevel;
}
