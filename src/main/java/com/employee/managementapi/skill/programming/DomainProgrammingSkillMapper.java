package com.employee.managementapi.skill.programming;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.employee.managementapi.employee.EmployeeId;

@Mapper
public interface DomainProgrammingSkillMapper {
	/**
	 * 社員のプログラムスキルをスキルIDとスキルレベルで検索して該当する社員ID一覧を返す
	 * 
	 * @param domainProgrammingSkills     検索したいプログラミングスキルIDとスキルレベル
	 * @param domainProgrammingSkillsSize 検索したいプログラミングスキルの数
	 * @return 検索結果に該当した社員ID一覧
	 */
	List<Integer> selectEmployeeIdListByFilterList(
			@Param("domainProgrammingSkills") List<ProgrammingSkill> domainProgrammingSkills,
			@Param("domainProgrammingSkillsSize") int domainProgrammingSkillsSize);

	/**
	 * 社員ID一覧をもとにプログラミングスキルを検索する
	 * 
	 * @param employeeIds 社員ID一覧
	 * @return 検索したプログラミングスキル
	 */
	List<ProgrammingSkill> selectListByEnployeeIdList(List<EmployeeId> employeeIds);
}
