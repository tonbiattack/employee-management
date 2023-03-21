package com.employee.managementapi.skill.framework;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.managementapi.employee.EmployeeId;
import com.employee.managementapi.employee.EmployeeIdList;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FrameworkSkillQueryServiceImpl implements
		FrameworkSkillQueryService {

	private final DomainFrameworkSkillMapper domainFrameworkSkillMapper;

	@Override
	public EmployeeIdList getEmployeeIdListByFilterFrameworkSkillList(
			FrameworkSkillList frameworkSkillList) {
		List<FrameworkSkill> frameworkSkills = frameworkSkillList.toDomainFrameworkSkills();
		// 検索対象のフレームワークスキル、フレームワークスキルレベルを持つ社員IDを検索する
		List<Integer> frameworkFilteredIds = domainFrameworkSkillMapper.selectEmployeeIdListByFilterList(
				frameworkSkills,
				frameworkSkills.size());
		List<EmployeeId> frameworkSkillFilteredEmployeeIds = new ArrayList<>();
		// ファーストクラスコレクションに変換するためにプリミティブ型からドメインクラスに変換する
		for (Integer integerEmployeeId : frameworkFilteredIds) {
			frameworkSkillFilteredEmployeeIds.add(new EmployeeId(integerEmployeeId));
		}
		return new EmployeeIdList(frameworkSkillFilteredEmployeeIds);
	}

	@Override
	public FrameworkSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList) {
		return new FrameworkSkillList(domainFrameworkSkillMapper
				.selectListByEnployeeIdList(employeeIdList.toEmployeeIds()));
	}

}
