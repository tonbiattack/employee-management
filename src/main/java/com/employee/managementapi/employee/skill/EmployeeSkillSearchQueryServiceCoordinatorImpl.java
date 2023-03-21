package com.employee.managementapi.employee.skill;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.employee.EmployeeBasicProfile;
import com.employee.managementapi.employee.EmployeeBasicProfileList;
import com.employee.managementapi.employee.EmployeeBasicProfileQueryService;
import com.employee.managementapi.employee.EmployeeIdList;
import com.employee.managementapi.skill.database.DatabaseSkillList;
import com.employee.managementapi.skill.database.DatabaseSkillQueryService;
import com.employee.managementapi.skill.framework.FrameworkSkillList;
import com.employee.managementapi.skill.framework.FrameworkSkillQueryService;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkillList;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkillQueryService;
import com.employee.managementapi.skill.programming.ProgrammingSkillList;
import com.employee.managementapi.skill.programming.ProgrammingSkillQueryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class EmployeeSkillSearchQueryServiceCoordinatorImpl implements EmployeeSkillSearchQueryServiceCoordinator {

	private final ProgrammingSkillQueryService programmingSkillQueryService;

	private final DatabaseSkillQueryService databaseSkillQueryService;

	private final InfrastructureSkillQueryService infrastructureSkillQueryService;

	private final FrameworkSkillQueryService frameworkSkillQueryService;

	private final EmployeeBasicProfileQueryService employeeBasicProfileQueryService;

	@Override
	public EmployeeSkillSearchList multiSkillFilter(EmployeeSkill employeeSkill) {
		/**
		 * プログラミングスキル重複判定
		 */
		// 検索対象のプログラミングスキル、プログラミングスキルレベルを持つ社員IDを検索する
		// 初回なので重複判定しない
		EmployeeIdList programFilteredEmployeeIdList = programmingSkillQueryService
				.getEmployeeIdListByFilterProgrammingSkillList(employeeSkill.getProgrammingSkillList());

		/**
		 * データベーススキル重複判定
		 */
		// 検索対象のデータベーススキル、データベーススキルレベルを持つ社員IDを検索する
		EmployeeIdList databaseFilteredEmployeeIdList = databaseSkillQueryService
				.getEmployeeIdListByFilterDatabaseSkillList(employeeSkill.getDatabaseSkillList());
		// ファーストクラスコレクションに変換し、社員IDの重複判定処理を行う
		EmployeeIdList afterDatabaseFilteredEmployeeIdList = programFilteredEmployeeIdList
				.duplicateJudgment(databaseFilteredEmployeeIdList);

		/**
		 * インフラスキル重複判定
		 */
		// 検索対象のインフラスキル、インフラスキルレベルを持つ社員IDを検索する
		EmployeeIdList infrastructureSkillFilteredEmployeeIdList = infrastructureSkillQueryService
				.getEmployeeIdListByFilterInfrastructureSkillList(employeeSkill
						.getInfrastructureSkillList());
		// 社員IDの重複判定処理を行う
		EmployeeIdList afterInfrastructureFilteredIds = afterDatabaseFilteredEmployeeIdList
				.duplicateJudgment(infrastructureSkillFilteredEmployeeIdList);

		/**
		 * フレームワークスキル重複判定
		 */
		// 検索対象のフレームワークスキル、フレームワークスキルレベルを持つ社員IDを検索する
		EmployeeIdList frameworkSkillFilteredEmployeeIdList = frameworkSkillQueryService
				.getEmployeeIdListByFilterFrameworkSkillList(employeeSkill.getFrameworkSkillList());
		// 社員IDの重複判定処理を行う
		EmployeeIdList afterCheckedEmployeeIdList = afterInfrastructureFilteredIds
				.duplicateJudgment(frameworkSkillFilteredEmployeeIdList);

		// リストのサイズがゼロの場合、処理をこれ以降しない
		if (afterCheckedEmployeeIdList.size() == 0) {
			return null;
		}

		// 社員基本情報を社員IDで取得
		EmployeeBasicProfileList employeeBasicProfileList = employeeBasicProfileQueryService
				.getListByEmployeeIds(afterCheckedEmployeeIdList);
		// プログラミングスキルを社員IDで取得
		ProgrammingSkillList filteredDomainProgrammingSkillList = programmingSkillQueryService
				.getListByEnployeeIdList(afterCheckedEmployeeIdList);
		// フレームワークスキルを社員IDで取得
		FrameworkSkillList filteredDomainFrameworkSkillList = frameworkSkillQueryService
				.getListByEnployeeIdList(afterCheckedEmployeeIdList);
		// データベーススキルを社員IDで取得
		DatabaseSkillList filteredDomainDatabaseSkillList = databaseSkillQueryService
				.getListByEnployeeIdList(afterCheckedEmployeeIdList);
		// インフラスキルを社員IDで取得
		InfrastructureSkillList filteredDomainInfrastructureSkillList = infrastructureSkillQueryService
				.getListByEnployeeIdList(afterDatabaseFilteredEmployeeIdList);

		// スキルを分割するためのインデックスカウンタ－
		int domainDatabaseSkillCounter = 0;
		int domainProgrammingSkillCounter = 0;
		int domainInfrastructureSkillCounter = 0;
		int domainFrameworkSkillCounter = 0;

		// 社員数をこの後に複数回使用するので変数に入れておく。
		int employeeSize = employeeBasicProfileList.size();

		// レスポンス
		List<EmployeeSkillSearch> employeeSkillSearchs = new ArrayList<>();

		// リスト型になっている社員スキルを各社員ごとに分割する
		for (int employeeCount = 0; employeeCount < employeeBasicProfileList.size(); employeeCount++) {
			EmployeeBasicProfile employeeBasicProfile = employeeBasicProfileList.get(employeeCount);

			// データベーススキルリストを社員ごとに分ける。
			DatabaseSkillList databaseSkillList = filteredDomainDatabaseSkillList
					.split(employeeSize, domainDatabaseSkillCounter);
			domainDatabaseSkillCounter += filteredDomainDatabaseSkillList.size() / employeeSize;

			// プログラミングスキルを社員ごとに分ける。
			ProgrammingSkillList programmingSkillList = filteredDomainProgrammingSkillList
					.split(employeeSize, domainProgrammingSkillCounter);
			domainProgrammingSkillCounter += filteredDomainProgrammingSkillList.size() / employeeSize;

			// フレームワークスキルを社員ごとに分ける。
			FrameworkSkillList frameworkSkillList = filteredDomainFrameworkSkillList.split(employeeSize,
					domainFrameworkSkillCounter);
			domainFrameworkSkillCounter += filteredDomainFrameworkSkillList.size() / employeeSize;

			// インフラスキルを社員ごとに分ける。
			InfrastructureSkillList infrastructureSkillList = filteredDomainInfrastructureSkillList
					.split(employeeSize, domainInfrastructureSkillCounter);
			domainInfrastructureSkillCounter += filteredDomainInfrastructureSkillList.size() / employeeSize;

			// レスポンスに型を変換する前の処理
			EmployeeSkillSearch employeeSkillSearch = new EmployeeSkillSearch(employeeBasicProfile,
					programmingSkillList, frameworkSkillList, databaseSkillList,
					infrastructureSkillList);
			employeeSkillSearchs.add(employeeSkillSearch);
		}
		return new EmployeeSkillSearchList(employeeSkillSearchs);

	}

}
