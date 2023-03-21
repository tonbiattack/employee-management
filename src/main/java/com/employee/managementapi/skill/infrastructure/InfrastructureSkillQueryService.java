package com.employee.managementapi.skill.infrastructure;

import com.employee.managementapi.employee.EmployeeIdList;

/**
 * インフラスキル取得サービス
 */
public interface InfrastructureSkillQueryService {

	/**
	 * インフラスキルを持っている社員IDを検索する。
	 * 
	 * @param infrastructureSkillList インフラスキルリスト
	 * @return ファーストコレクション社員ID
	 */
	EmployeeIdList getEmployeeIdListByFilterInfrastructureSkillList(InfrastructureSkillList infrastructureSkillList);

	/**
	 * 社員ID一覧を一覧をもとにインフラスキルを検索する。
	 * 
	 * @param employeeIdList 社員IDリスト
	 * @return ファーストコレクションインフラスキルリスト
	 */
	InfrastructureSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList);
}
