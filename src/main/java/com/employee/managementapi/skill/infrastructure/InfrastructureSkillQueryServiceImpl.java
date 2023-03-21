package com.employee.managementapi.skill.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.managementapi.employee.EmployeeId;
import com.employee.managementapi.employee.EmployeeIdList;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InfrastructureSkillQueryServiceImpl implements
		InfrastructureSkillQueryService {

	private final DomainInfrastructureSkillMapper domainInfrastructureSkillMapper;

	@Override
	public EmployeeIdList getEmployeeIdListByFilterInfrastructureSkillList(
			InfrastructureSkillList infrastructureSkillList) {
		List<InfrastructureSkill> infrastructureSkills = infrastructureSkillList.toInfrastructureSkills();
		// 検索対象のインフラスキル、インフラスキルレベルを持つ社員IDを検索する
		List<Integer> infrastructureFilteredIds = domainInfrastructureSkillMapper.selectEmployeeIdListByFilterList(
				infrastructureSkills,
				infrastructureSkills.size());
		List<EmployeeId> infrastructureSkillFilteredEmployeeIds = new ArrayList<>();
		// ファーストクラスコレクションに変換するためにプリミティブ型からドメインクラスに変換する
		for (Integer integerEmployeeId : infrastructureFilteredIds) {
			infrastructureSkillFilteredEmployeeIds.add(new EmployeeId(integerEmployeeId));
		}
		return new EmployeeIdList(infrastructureSkillFilteredEmployeeIds);
	}

	@Override
	public InfrastructureSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList) {
		return new InfrastructureSkillList(domainInfrastructureSkillMapper
				.selectListByEnployeeIdList(employeeIdList.toEmployeeIds()));
	}

}
