package com.employee.managementapi.employee.skill.database;

/**
 * 社員データベーススキル更新サービス
 */
public interface EmployeeDatabaseSkillUpdateService {
	/**
	 * 社員データベーススキルを一件更新します。
	 * 
	 * @param employeeDatabaseSkill 更新する社員データベーススキルIDを含む社員データベーススキル
	 * @return 更新した社員データベーススキルの内容
	 */
	EmployeeDatabaseSkill update(EmployeeDatabaseSkill employeeDatabaseSkill);

	/**
	 * 社員データベーススキルを一件削除します。
	 * 使用するユースケースは本ケースでは想定されていませんが、Delete機能の試験的な実装を目的に作成されました。
	 * 
	 * @param employeeDatabaseSkillId 削除したい社員データベーススキルID
	 */
	void delete(int employeeDatabaseSkillId);
}
