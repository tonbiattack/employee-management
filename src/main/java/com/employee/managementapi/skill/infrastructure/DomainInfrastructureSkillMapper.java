package com.employee.managementapi.skill.infrastructure;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.employee.managementapi.employee.EmployeeId;

@Mapper
public interface DomainInfrastructureSkillMapper {
	/**
	 * 社員のインフラスキルをスキルIDとスキルレベルで検索して該当する社員ID一覧を返す
	 * 
	 * @param infrastructureSkills     検索したいインフラスキルIDとスキルレベル
	 * @param domainInfrastructureSkillsSize 検索したいインフラスキルの数
	 * @return 検索結果に該当した社員ID一覧
	 */
	List<Integer> selectEmployeeIdListByFilterList(
			@Param("domainInfrastructureSkills") List<InfrastructureSkill> domainInfrastructureSkills,
			@Param("domainInfrastructureSkillsSize") int domainInfrastructureSkillsSize);

	/**
	 * 社員ID一覧をもとにインフラスキルを検索する
	 * 
	 * @param employeeIds 社員ID一覧
	 * @return 検索したインフラスキル
	 */
	List<InfrastructureSkill> selectListByEnployeeIdList(List<EmployeeId> employeeIds);
}
