package com.employee.managementapi.skill.programming;

import com.employee.managementapi.employee.EmployeeIdList;

/**
 * プログラミングスキル取得サービス
 */
public interface ProgrammingSkillQueryService {

	/**
	 * プログラミングスキルを持っている社員IDを検索する。
	 * 
	 * @param programmingSkillList プログラミングスキルリスト
	 * @return ファーストコレクション社員ID	
	 */
	EmployeeIdList getEmployeeIdListByFilterProgrammingSkillList(ProgrammingSkillList programmingSkillList);

	/**
	 * 社員ID一覧を一覧をもとにプログラミングスキルを検索する。
	 * 
	 * @param employeeIdList ファーストコレクション社員IDリスト
	 * @return プログラミングスキルリスト
	 */
	ProgrammingSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList);
}
