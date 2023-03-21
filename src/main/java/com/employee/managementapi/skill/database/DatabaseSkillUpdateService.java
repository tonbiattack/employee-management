package com.employee.managementapi.skill.database;

/**
 * データベーススキル登録サービス
 */
public interface DatabaseSkillUpdateService {
    DatabaseSkillNameWithPrimaryKey insert(final DatabaseSkillName databaseSkillName);
}
