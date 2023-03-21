package com.employee.managementapi.skill.programming;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.managementapi.employee.EmployeeId;
import com.employee.managementapi.employee.EmployeeIdList;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProgrammingSkillQueryServiceImpl implements ProgrammingSkillQueryService {
	private final DomainProgrammingSkillMapper domainProgrammingSkillMapper;

	@Override
	public EmployeeIdList getEmployeeIdListByFilterProgrammingSkillList(
			ProgrammingSkillList programmingSkillList) {
		List<ProgrammingSkill> programmingSkills = programmingSkillList.toDomainProgrammingSkills();
		// 検索対象のプログラミングスキル、プログラミングスキルレベルを持つ社員IDを検索する
		List<Integer> programFilteredIds = domainProgrammingSkillMapper.selectEmployeeIdListByFilterList(
				programmingSkills,
				programmingSkills.size());
		List<EmployeeId> programFilteredEmployeeIds = new ArrayList<>();
		// ファーストクラスコレクションに変換するためにプリミティブ型からドメインクラスに変換する
		for (Integer integerEmployeeId : programFilteredIds) {
			programFilteredEmployeeIds.add(new EmployeeId(integerEmployeeId));
		}
		return new EmployeeIdList(programFilteredEmployeeIds);
	}

	@Override
	public ProgrammingSkillList getListByEnployeeIdList(EmployeeIdList employeeIdList) {
		return new ProgrammingSkillList(domainProgrammingSkillMapper
				.selectListByEnployeeIdList(employeeIdList.toEmployeeIds()));
	}

}
