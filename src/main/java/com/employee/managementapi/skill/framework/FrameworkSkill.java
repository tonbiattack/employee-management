package com.employee.managementapi.skill.framework;

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
 * フレームワークスキル
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ApiModel(description = "フレームワークスキル")
public class FrameworkSkill {
	@ApiModelProperty(value = "フレームワークスキルID", example = "3")
	@NotNull
	private int frameworkSkillId;

	@NotBlank
	@ApiModelProperty(value = "フレームワークスキル名", example = "Angular")
	@Size(max = 20)
	private String frameworkSkillName;

	@NotNull
	@ApiModelProperty(value = "スキルレベル", example = "3")
	@Range(min = 1, max = 10)
	private int skillLevel;
}
