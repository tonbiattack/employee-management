package com.employee.managementapi.skill.framework;

import com.employee.managementapi.employee.EmployeeIdList;

/**
 * フレームワークスキル取得サービス
 */
public interface FrameworkSkillQueryService {

	/**
	 * フレームワークスキルを持っている社員IDを検索する。
	 * 
	 * @param frameworkSkillList フレームワークスキルリスト
	 * @return ファーストコレクション社員ID
	 */
	EmployeeIdList getEmployeeIdListByFilterFrameworkSkillList(FrameworkSkillList frameworkSkillList);

	/**
	 * 社員ID一覧を一覧をもとにフレームワークスキルを検索する。
	 * 
	 * @param employeeIdList ファーストコレクション社員IDリスト
	 * @return フレームワークスキルリスト
	 */
	FrameworkSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList);
}
