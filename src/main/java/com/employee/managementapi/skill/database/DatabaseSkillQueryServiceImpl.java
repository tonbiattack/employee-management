package com.employee.managementapi.skill.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.managementapi.employee.EmployeeId;
import com.employee.managementapi.employee.EmployeeIdList;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DatabaseSkillQueryServiceImpl implements
		DatabaseSkillQueryService {

	private final DomainDatabaseSkillMapper domainDatabaseSkillMapper;

	@Override
	public EmployeeIdList getEmployeeIdListByFilterDatabaseSkillList(
			DatabaseSkillList databaseSkillList) {
		List<DatabaseSkill> databaseSkills = databaseSkillList.toDomainDatabaseSkills();
		// 検索対象のデータベーススキル、データベーススキルレベルを持つ社員IDを検索する
		List<Integer> databaseFilteredIds = domainDatabaseSkillMapper.selectEmployeeIdListByFilterList(databaseSkills,
				databaseSkills.size());
		List<EmployeeId> databaseFilteredEmployeeIds = new ArrayList<>();
		// ファーストクラスコレクションに変換するためにプリミティブ型からドメインクラスに変換する
		for (Integer integerEmployeeId : databaseFilteredIds) {
			databaseFilteredEmployeeIds.add(new EmployeeId(integerEmployeeId));
		}
		return new EmployeeIdList(databaseFilteredEmployeeIds);
	}

	@Override
	public DatabaseSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList) {
		return new DatabaseSkillList(domainDatabaseSkillMapper
				.selectListByEnployeeIdList(employeeIdList.toEmployeeIds()));
	}

}
