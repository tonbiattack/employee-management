package com.employee.managementapi.employee.skill.infrastructure;

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

public class EmployeeInfrastructureSkillQueryServiceImplTest {

	@Mock
	private EmployeeInfrastructureSkillMapper employeeInfrastructureSkillMapper;

	@InjectMocks
	private EmployeeInfrastructureSkillQueryServiceImpl employeeInfrastructureSkillQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: 社員のインフラスキルが全て受け取れているのか")
	@Test
	public void testSelectAll() {
		EmployeeInfrastructureSkill EmployeeInfrastructureSkill1 = new EmployeeInfrastructureSkill(9, 9, "9", "Azure",
				9);
		EmployeeInfrastructureSkill EmployeeInfrastructureSkill2 = new EmployeeInfrastructureSkill(9, 6009, "9", "GCP",
				2);

		List<EmployeeInfrastructureSkill> EmployeeInfrastructureSkills = new ArrayList<>();
		EmployeeInfrastructureSkills.add(EmployeeInfrastructureSkill1);
		EmployeeInfrastructureSkills.add(EmployeeInfrastructureSkill2);
		when(employeeInfrastructureSkillMapper.selectList()).thenReturn(EmployeeInfrastructureSkills);

		EmployeeInfrastructureSkillList actuals = employeeInfrastructureSkillQueryServiceImpl.getList();
		assertEquals(2, actuals.size());
		verify(employeeInfrastructureSkillMapper, times(1)).selectList();
	}
}
