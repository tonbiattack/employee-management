package com.employee.managementapi.employee.skill.database;

import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * ファーストコレクション社員データベーススキルリスト
 */
@Getter
@ApiModel(description = "社員データベーススキルリスト")
public class EmployeeDatabaseSkillList {
	@NotBlank
	@ApiModelProperty(value = "社員データベーススキルリスト")
	private final List<EmployeeDatabaseSkill> employeeDatabaseSkills;

	/**
	 * 現役社員のデータベーススキルリストを取得する。退職社員に関しては取得しません。
	 * 
	 * @param 現役社員全員のデータベーススキル
	 */
	EmployeeDatabaseSkillList(final List<EmployeeDatabaseSkill> employeeDatabaseSkills) {
		this.employeeDatabaseSkills = employeeDatabaseSkills;
	}

	/**
	 * 社員データベーススキルリストのサイズを数える。
	 * 
	 * @return 社員データベーススキルリストのサイズ
	 */
	public int size() {
		return employeeDatabaseSkills.size();
	}
}
