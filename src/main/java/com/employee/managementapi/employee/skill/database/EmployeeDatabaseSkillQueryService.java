package com.employee.managementapi.employee.skill.database;

/**
 * 社員データベーススキル参照サービス
 */
public interface EmployeeDatabaseSkillQueryService {
    /**
     * 現役社員全員のデータベーススキルを取得する。一人の社員IDに対して複数のスキルが結びつきます。1対多。
     * 
     * @return 現役社員全員のデータベーススキル
     */
    EmployeeDatabaseSkillList getList();
}
