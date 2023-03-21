package com.employee.managementapi.skill.database;

import com.employee.managementapi.employee.EmployeeIdList;

/**
 * データベーススキル取得サービス
 */
public interface DatabaseSkillQueryService {

	/**
	 * データベーススキルを持っている社員IDを検索する。
	 * 
	 * @param databaseSkillList データベーススキルリスト
	 * @return ファーストコレクション社員ID
	 */
	EmployeeIdList getEmployeeIdListByFilterDatabaseSkillList(DatabaseSkillList databaseSkillList);

	/**
	 * 社員ID一覧を一覧をもとにデータベーススキルを検索する。
	 * 
	 * @param employeeIdList ファーストコレクション社員IDリスト
	 * @return データベーススキルリスト
	 */
	DatabaseSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList);
}
