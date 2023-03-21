package com.employee.managementapi.employee.skill;

import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社員スキル検索結果
 * レスポンスボディで使用する予定
 * EmployeeSkillのレスポンスリスト
 */
@Getter
@ApiModel(description = "社員スキルリスト")
@AllArgsConstructor
public class EmployeeSkillSearchList {
	@NotBlank
	private List<EmployeeSkillSearch> employeeSkillSearchs;
}
