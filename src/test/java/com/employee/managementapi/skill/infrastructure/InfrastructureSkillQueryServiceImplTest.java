package com.employee.managementapi.skill.infrastructure;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.employee.EmployeeId;
import com.employee.managementapi.employee.EmployeeIdList;

public class InfrastructureSkillQueryServiceImplTest {

	@Mock
	private DomainInfrastructureSkillMapper infrastructureSkillMapper;

	@InjectMocks
	private InfrastructureSkillQueryServiceImpl infrastructureSkillQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: インフラスキルを受け取り、該当する社員IDを返すことが出来ているか")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, "Debian", 4);
		List<InfrastructureSkill> domainInfrastructureSkills = new ArrayList<>();
		domainInfrastructureSkills.add(domainInfrastructureSkill1);
		domainInfrastructureSkills.add(domainInfrastructureSkill2);
		InfrastructureSkillList infrastructureSkillList = new InfrastructureSkillList(
				domainInfrastructureSkills);
		List<Integer> employeeIdList = new ArrayList<>();
		employeeIdList.add(19);
		employeeIdList.add(89);

		when(infrastructureSkillMapper.selectEmployeeIdListByFilterList(domainInfrastructureSkills,
				domainInfrastructureSkills.size())).thenReturn(employeeIdList);

		EmployeeIdList actuals = infrastructureSkillQueryServiceImpl
				.getEmployeeIdListByFilterInfrastructureSkillList(infrastructureSkillList);
		assertEquals(2, actuals.size());
		verify(infrastructureSkillMapper, times(1))
				.selectEmployeeIdListByFilterList(domainInfrastructureSkills, domainInfrastructureSkills.size());
	}

	@DisplayName("SELECT TEST: 社員ID一覧を受け取り、社員IDのインフラスキルを返す")
	@Test
	public void testSelectListByEmployeeIdList() {

		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(4, "C#", 4);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(3, "C言語", 4);
		InfrastructureSkill domainInfrastructureSkill3 = new InfrastructureSkill(4, "C#", 9);
		InfrastructureSkill domainInfrastructureSkill4 = new InfrastructureSkill(4, "C#", 8);
		List<InfrastructureSkill> domainInfrastructureSkills = new ArrayList<>();
		domainInfrastructureSkills.add(domainInfrastructureSkill1);
		domainInfrastructureSkills.add(domainInfrastructureSkill2);
		domainInfrastructureSkills.add(domainInfrastructureSkill3);
		domainInfrastructureSkills.add(domainInfrastructureSkill4);
		EmployeeId employeeId1 = new EmployeeId(19);
		EmployeeId employeeId2 = new EmployeeId(89);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		EmployeeIdList employeeIdList = new EmployeeIdList(employeeIds);
		when(infrastructureSkillMapper.selectListByEnployeeIdList(employeeIds))
				.thenReturn(domainInfrastructureSkills);

		InfrastructureSkillList actuals = infrastructureSkillQueryServiceImpl
				.getListByEnployeeIdList(employeeIdList);

		assertEquals(4, actuals.size());

		verify(infrastructureSkillMapper, times(1))
				.selectListByEnployeeIdList(employeeIds);
	}

}
