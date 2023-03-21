package com.employee.managementapi.employee.skill;

/**
 * 社員スキル検索サービス
 */
public interface EmployeeSkillSearchQueryServiceCoordinator {
	/**
	 * 複数のスキルとレベルで社員のスキルを検索します。
	 * 
	 * @param employeeSkill 社員の各スキルのIDとレベル
	 * @return 検索結果に該当した社員基本情報 + スキル
	 */
	EmployeeSkillSearchList multiSkillFilter(EmployeeSkill employeeSkill);
}
