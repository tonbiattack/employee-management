package com.employee.managementapi.skill.framework;

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

public class FrameworkSkillQueryServiceImplTest {

	@Mock
	private DomainFrameworkSkillMapper domainFrameworkSkillMapper;

	@InjectMocks
	private FrameworkSkillQueryServiceImpl frameworkSkillQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: フレームワークスキルを受け取り、該当する社員IDを返すことが出来ているか")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 8);
		List<FrameworkSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainFrameworkSkill1);
		domainFrameworkSkills.add(domainFrameworkSkill2);
		FrameworkSkillList frameworkSkillList = new FrameworkSkillList(domainFrameworkSkills);
		List<Integer> employeeIdList = new ArrayList<>();
		employeeIdList.add(19);
		employeeIdList.add(89);

		when(domainFrameworkSkillMapper.selectEmployeeIdListByFilterList(domainFrameworkSkills,
				domainFrameworkSkills.size())).thenReturn(employeeIdList);

		EmployeeIdList actuals = frameworkSkillQueryServiceImpl
				.getEmployeeIdListByFilterFrameworkSkillList(frameworkSkillList);
		assertEquals(2, actuals.size());
		verify(domainFrameworkSkillMapper, times(1))
				.selectEmployeeIdListByFilterList(domainFrameworkSkills, domainFrameworkSkills.size());
	}

	@DisplayName("SELECT TEST: 社員ID一覧を受け取り、社員IDのフレームワークスキルを返す")
	@Test
	public void testSelectListByEmployeeIdList() {

		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 8);
		FrameworkSkill domainFrameworkSkill3 = new FrameworkSkill(4, "Spring Boot", 5);
		FrameworkSkill domainFrameworkSkill4 = new FrameworkSkill(4, "Spring Boot", 5);
		List<FrameworkSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainFrameworkSkill1);
		domainFrameworkSkills.add(domainFrameworkSkill2);
		domainFrameworkSkills.add(domainFrameworkSkill3);
		domainFrameworkSkills.add(domainFrameworkSkill4);
		EmployeeId employeeId1 = new EmployeeId(61);
		EmployeeId employeeId2 = new EmployeeId(91);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		EmployeeIdList employeeIdList = new EmployeeIdList(employeeIds);
		when(domainFrameworkSkillMapper.selectListByEnployeeIdList(employeeIds)).thenReturn(domainFrameworkSkills);

		FrameworkSkillList actuals = frameworkSkillQueryServiceImpl
				.getListByEnployeeIdList(employeeIdList);

		assertEquals(4, actuals.size());

		verify(domainFrameworkSkillMapper, times(1))
				.selectListByEnployeeIdList(employeeIds);
	}

}
