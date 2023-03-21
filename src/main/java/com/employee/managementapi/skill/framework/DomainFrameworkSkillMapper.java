package com.employee.managementapi.skill.framework;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.employee.managementapi.employee.EmployeeId;

@Mapper
public interface DomainFrameworkSkillMapper {
	/**
	 * 社員のフレームワークスキルをスキルIDとスキルレベルで検索して該当する社員ID一覧を返す
	 * 
	 * @param frameworkSkills     検索したいフレームワークスキルIDとスキルレベル
	 * @param domainFrameworkSkillsSize 検索したいフレームワークスキルの数
	 * @return 検索結果に該当した社員ID一覧
	 */
	List<Integer> selectEmployeeIdListByFilterList(
			@Param("domainFrameworkSkills") List<FrameworkSkill> domainFrameworkSkills,
			@Param("domainFrameworkSkillsSize") int domainFrameworkSkillsSize);

	/**
	 * 社員ID一覧をもとにフレームワークスキルを検索する
	 * 
	 * @param employeeIds 社員ID一覧
	 * @return 検索したフレームワークスキル
	 */
	List<FrameworkSkill> selectListByEnployeeIdList(List<EmployeeId> employeeIds);
}
