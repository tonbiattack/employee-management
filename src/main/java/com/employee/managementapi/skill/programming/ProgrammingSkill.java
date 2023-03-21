package com.employee.managementapi.skill.programming;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * プログラミングスキル
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProgrammingSkill {
	@ApiModelProperty(value = "プログラミングスキルID", example = "3")
	@NotNull
	private int programmingSkillId;

	@ApiModelProperty(value = "プログラミングスキル名", example = "C言語")
	@NotBlank
	@Size(max = 20)
	private String programmingSkillName;

	@ApiModelProperty(value = "スキルレベル", example = "3")
	@Range(min = 1, max = 10)
	@NotNull
	private int skillLevel;
}
