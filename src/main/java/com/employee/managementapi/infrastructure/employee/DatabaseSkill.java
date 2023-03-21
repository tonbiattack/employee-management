package com.employee.managementapi.infrastructure.employee;

import com.employee.managementapi.skill.database.DatabaseSkillName;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class DatabaseSkill {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.database_skill.database_skill_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer databaseSkillId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.database_skill.database_skill_name
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private String databaseSkillName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.database_skill.database_skill_id
	 * 
	 * @return the value of employee.database_skill.database_skill_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getDatabaseSkillId() {
		return databaseSkillId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.database_skill.database_skill_id
	 * 
	 * @param databaseSkillId the value for
	 *                        employee.database_skill.database_skill_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDatabaseSkillId(Integer databaseSkillId) {
		this.databaseSkillId = databaseSkillId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.database_skill.database_skill_name
	 * 
	 * @return the value of employee.database_skill.database_skill_name
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public String getDatabaseSkillName() {
		return databaseSkillName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.database_skill.database_skill_name
	 * 
	 * @param databaseSkillName the value for
	 *                          employee.database_skill.database_skill_name
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDatabaseSkillName(String databaseSkillName) {
		this.databaseSkillName = databaseSkillName == null ? null : databaseSkillName.trim();
	}

	/**
	 * ドメインオブジェクトからインスタンスを生成
	 * 
	 * @param domainDatabaseSkill ドメインオブジェクト
	 * @return DBエンティティのインスタンス
	 */
	public static DatabaseSkill build(final DatabaseSkillName domainDatabaseSkill) {
		return DatabaseSkill.builder()
				.databaseSkillName(domainDatabaseSkill.getDatabaseSkillName())
				.build();
	}

	/**
	 * DBエンティティをドメインオブジェクトへ変換
	 * 
	 * @return ドメインオブジェクト
	 */
	public DatabaseSkillName toDomainDatabaseSkill() {
		return DatabaseSkillName.builder()
				.databaseSkillName(this.databaseSkillName)
				.build();
	}
}