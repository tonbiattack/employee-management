package com.employee.managementapi.skill.database;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.employee.managementapi.employee.EmployeeId;

@Mapper
public interface DomainDatabaseSkillMapper {
	/**
	 * 社員のデータベーススキルをスキルIDとスキルレベルで検索して該当する社員ID一覧を返す
	 * 
	 * @param databaseSkills     検索したいデータベーススキルIDとスキルレベル
	 * @param domainDatabaseSkillsSize 検索したいデータベーススキルの数
	 * @return 検索結果に該当した社員ID一覧
	 */
	List<Integer> selectEmployeeIdListByFilterList(
			@Param("domainDatabaseSkills") List<DatabaseSkill> domainDatabaseSkills,
			@Param("domainDatabaseSkillsSize") int domainDatabaseSkillsSize);

	/**
	 * 社員ID一覧をもとにデータベーススキルを検索する
	 * 
	 * @param employeeIds 社員ID一覧
	 * @return 検索したデータベーススキル
	 */
	List<DatabaseSkill> selectListByEnployeeIdList(List<EmployeeId> employeeIds);
}
