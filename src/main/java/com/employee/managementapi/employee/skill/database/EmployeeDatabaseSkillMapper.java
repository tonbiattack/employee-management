package com.employee.managementapi.employee.skill.database;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDatabaseSkillMapper {
	/**
	 * 現役社員全員のデータベーススキルを取得する。一人の社員IDに対して複数のスキルが結びつきます。1対多。詳しくはSwagger参照。
	 * 退職社員は取得対象に含みません。
	 * 
	 * @return 現役社員全員のデータベーススキル
	 */
	List<EmployeeDatabaseSkill> selectList();

	/**
	 * 社員のデータベーススキルを一件更新します。
	 * 
	 * @param employeeDatabaseSkill 社員データベーススキル
	 * @return 更新した件数、更新対象があった場合は1、ない場合は0を返却します。
	 */
	int update(final EmployeeDatabaseSkill employeeDatabaseSkill);

	/**
	 * 社員のデータベーススキルを削除します。
	 * 使用するユースケースは本ケースでは想定されていませんが、Delete機能の試験的な実装を目的に作成されました。
	 * 
	 * @param employeeDatabaseSkillId 削除したい社員データベーススキルID
	 * @return 削除した件数、削除対象のデータベーススキルIDがあった場合は1を返却し、ない場合は0を返却します。
	 */
	int delete(final int employeeDatabaseSkillId);
}
