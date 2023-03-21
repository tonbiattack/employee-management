package com.employee.managementapi.skill.programming;

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

public class ProgrammingSkillQueryServiceImplTest {

	@Mock
	private DomainProgrammingSkillMapper domainProgrammingSkillMapper;

	@InjectMocks
	private ProgrammingSkillQueryServiceImpl programmingSkillQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: プログラミングスキルを受け取り、該当する社員IDを返すことが出来ているか")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(3, null, 3);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(4, null, 3);
		List<ProgrammingSkill> domainProgrammingSkills = new ArrayList<>();
		domainProgrammingSkills.add(domainProgrammingSkill1);
		domainProgrammingSkills.add(domainProgrammingSkill2);
		ProgrammingSkillList programmingSkillList = new ProgrammingSkillList(domainProgrammingSkills);
		List<Integer> employeeIdList = new ArrayList<>();
		employeeIdList.add(19);
		employeeIdList.add(89);

		when(domainProgrammingSkillMapper.selectEmployeeIdListByFilterList(domainProgrammingSkills,
				domainProgrammingSkills.size())).thenReturn(employeeIdList);

		EmployeeIdList actuals = programmingSkillQueryServiceImpl
				.getEmployeeIdListByFilterProgrammingSkillList(programmingSkillList);
		assertEquals(2, actuals.size());
		verify(domainProgrammingSkillMapper, times(1))
				.selectEmployeeIdListByFilterList(domainProgrammingSkills, domainProgrammingSkills.size());
	}

	@DisplayName("SELECT TEST: 社員ID一覧を受け取り、社員IDのプログラミングスキルを返す")
	@Test
	public void testSelectListByEmployeeIdList() {
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(4, "C#", 4);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(3, "C言語", 4);
		ProgrammingSkill domainProgrammingSkill3 = new ProgrammingSkill(4, "C#", 9);
		ProgrammingSkill domainProgrammingSkill4 = new ProgrammingSkill(4, "C#", 8);
		List<ProgrammingSkill> domainProgrammingSkills = new ArrayList<>();
		domainProgrammingSkills.add(domainProgrammingSkill1);
		domainProgrammingSkills.add(domainProgrammingSkill2);
		domainProgrammingSkills.add(domainProgrammingSkill3);
		domainProgrammingSkills.add(domainProgrammingSkill4);
		EmployeeId employeeId1 = new EmployeeId(19);
		EmployeeId employeeId2 = new EmployeeId(89);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		EmployeeIdList employeeIdList = new EmployeeIdList(employeeIds);
		when(domainProgrammingSkillMapper.selectListByEnployeeIdList(employeeIds))
				.thenReturn(domainProgrammingSkills);

		ProgrammingSkillList actuals = programmingSkillQueryServiceImpl
				.getListByEnployeeIdList(employeeIdList);

		assertEquals(4, actuals.size());

		verify(domainProgrammingSkillMapper, times(1))
				.selectListByEnployeeIdList(employeeIds);
	}

}
