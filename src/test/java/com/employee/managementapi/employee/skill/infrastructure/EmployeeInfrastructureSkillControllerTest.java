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
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class EmployeeInfrastructureSkillControllerTest {

	private MockMvc mvc;

	@Mock
	private EmployeeInfrastructureSkillQueryService employeeInfrastructureSkillQueryService;

	@InjectMocks
	private EmployeeInfrastructureSkillController employeeInfrastructureSkillController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(employeeInfrastructureSkillController).build();
	}

	@DisplayName("SELECT TEST: 社員のインフラスキルが全て受け取れているのか")
	@Test
	public void testSelectAllInfrastructure() {
		EmployeeInfrastructureSkill employeeInfrastructureSkill1 = new EmployeeInfrastructureSkill(9, 9, "9", "Azure",
				9);
		EmployeeInfrastructureSkill employeeInfrastructureSkill2 = new EmployeeInfrastructureSkill(9, 6009, "9", "GCP",
				2);
		List<EmployeeInfrastructureSkill> employeeInfrastructureSkills = new ArrayList<>();
		employeeInfrastructureSkills.add(employeeInfrastructureSkill1);
		employeeInfrastructureSkills.add(employeeInfrastructureSkill2);
		EmployeeInfrastructureSkillList employeeInfrastructureSkillList = new EmployeeInfrastructureSkillList(
				employeeInfrastructureSkills);
		when(employeeInfrastructureSkillQueryService.getList()).thenReturn(employeeInfrastructureSkillList);

		EmployeeInfrastructureSkillList actuals = employeeInfrastructureSkillController.getList();
		assertEquals(2, actuals.size());
		verify(employeeInfrastructureSkillQueryService, times(1)).getList();
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// GET http://localhost:8080/api/v1/employees/skills/infrastructures
		mvc.perform(MockMvcRequestBuilders.get("/api/v1/employees/skills/infrastructures"))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

}