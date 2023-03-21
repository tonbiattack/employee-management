package com.employee.managementapi.employee.skill.database;

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
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDatabaseSkillControllerTest {

	private MockMvc mvc;

	@Mock
	private EmployeeDatabaseSkillUpdateService employeeDatabaseSkillUpdateService;

	@Mock
	private EmployeeDatabaseSkillQueryService employeeDatabaseSkillQueryService;

	@InjectMocks
	private EmployeeDatabaseSkillController employeeDatabaseSkillController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(employeeDatabaseSkillController).build();

	}

	@DisplayName("SELECT TEST: 社員のデータベーススキルが全て受け取れているのか")
	@Test
	public void testSelectAll() {
		EmployeeDatabaseSkill employeeDatabaseSkill1 = new EmployeeDatabaseSkill(9, 9, "9", "MySQL", 5);
		EmployeeDatabaseSkill employeeDatabaseSkill2 = new EmployeeDatabaseSkill(9, 6009, "9", "MySQL", 7);
		List<EmployeeDatabaseSkill> employeeDatabaseSkills = new ArrayList<>();
		employeeDatabaseSkills.add(employeeDatabaseSkill1);
		employeeDatabaseSkills.add(employeeDatabaseSkill2);
		EmployeeDatabaseSkillList employeeDatabaseSkillList = new EmployeeDatabaseSkillList(employeeDatabaseSkills);
		when(employeeDatabaseSkillQueryService.getList()).thenReturn(employeeDatabaseSkillList);

		EmployeeDatabaseSkillList actuals = employeeDatabaseSkillController.getList();
		assertEquals(2, actuals.size());
		verify(employeeDatabaseSkillQueryService, times(1)).getList();
	}

	@DisplayName("UPDATE TEST: 社員データベーススキルがupdateできているのか")
	@Test
	public void testUpdate() {
		EmployeeDatabaseSkill employeeDatabaseSkill = new EmployeeDatabaseSkill(9, 9, "9", "MySQL", 5);

		when(employeeDatabaseSkillUpdateService.update(employeeDatabaseSkill)).thenReturn(employeeDatabaseSkill);
		EmployeeDatabaseSkill response = employeeDatabaseSkillController.patch(employeeDatabaseSkill);

		assertEquals(employeeDatabaseSkill, response);
	}

	@DisplayName("DELETE TEST: 社員データベーススキルがdeleteできているか")
	@Test
	public void testDelete() {
		int employeeDatabaseSkillId = 3;
		doNothing().when(employeeDatabaseSkillUpdateService).delete(employeeDatabaseSkillId);
		employeeDatabaseSkillController.delete(employeeDatabaseSkillId);
		verify(employeeDatabaseSkillUpdateService, times(1)).delete(employeeDatabaseSkillId);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// GET http://localhost:8080/api/v1/employees/skills/databases
		mvc.perform(MockMvcRequestBuilders.get("/api/v1/employees/skills/databases"))
				.andExpect(MockMvcResultMatchers.status().isOk());

		// PATCH http://localhost:8080/api/v1/employees/skills/databases
		EmployeeDatabaseSkill employeeDatabaseSkill = new EmployeeDatabaseSkill(9, 9, "9", "MySQL", 5);
		ObjectMapper objectMapper = new ObjectMapper();
		mvc.perform(MockMvcRequestBuilders.patch("/api/v1/employees/skills/databases")
				.content(objectMapper.writeValueAsString(employeeDatabaseSkill))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk());

		// DELETE http://localhost:8080/api/v1/employees/skills/databases/6
		mvc.perform(MockMvcRequestBuilders.delete("/api/v1/employees/skills/databases/6"))
				.andExpect(MockMvcResultMatchers.status().isNoContent());

	}
}
