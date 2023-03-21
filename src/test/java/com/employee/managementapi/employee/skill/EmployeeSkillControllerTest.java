package com.employee.managementapi.employee.skill;

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

import com.employee.managementapi.employee.EmployeeBasicProfile;
import com.employee.managementapi.skill.database.DatabaseSkill;
import com.employee.managementapi.skill.database.DatabaseSkillList;
import com.employee.managementapi.skill.framework.FrameworkSkill;
import com.employee.managementapi.skill.framework.FrameworkSkillList;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkill;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkillList;
import com.employee.managementapi.skill.programming.ProgrammingSkill;
import com.employee.managementapi.skill.programming.ProgrammingSkillList;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSkillControllerTest {

	private MockMvc mvc;

	@Mock
	private EmployeeSkillSearchQueryServiceCoordinator employeeSkillSearchQueryServiceCoordinator;

	@InjectMocks
	private EmployeeSkillController employeeSkillController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(employeeSkillController).build();
	}

	@DisplayName("SELECT TEST: スキルの検索結果が受け取れているか")
	@Test
	public void testSelectSkillSearch() {

		// 前処理
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(3, "C言語", 3);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(4, "C#", 3);
		ProgrammingSkill domainProgrammingSkill3 = new ProgrammingSkill(3, "C言語", 3);
		ProgrammingSkill domainProgrammingSkill4 = new ProgrammingSkill(4, "C#", 3);

		// リクエスト
		List<ProgrammingSkill> requestDomainProgrammingSkills = new ArrayList<>();
		requestDomainProgrammingSkills.add(domainProgrammingSkill1);
		requestDomainProgrammingSkills.add(domainProgrammingSkill2);
		ProgrammingSkillList requestDomainProgrammingSkillList = new ProgrammingSkillList(
				requestDomainProgrammingSkills);
		// レスポンス
		List<ProgrammingSkill> responseDomainProgrammingSkills1 = new ArrayList<>();
		responseDomainProgrammingSkills1.add(domainProgrammingSkill1);
		responseDomainProgrammingSkills1.add(domainProgrammingSkill2);
		ProgrammingSkillList responseDomainProgrammingSkillList1 = new ProgrammingSkillList(
				responseDomainProgrammingSkills1);

		List<ProgrammingSkill> responseDomainProgrammingSkills2 = new ArrayList<>();
		responseDomainProgrammingSkills2.add(domainProgrammingSkill3);
		responseDomainProgrammingSkills2.add(domainProgrammingSkill4);
		ProgrammingSkillList responseDomainProgrammingSkillList2 = new ProgrammingSkillList(
				responseDomainProgrammingSkills2);

		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, "Debian", 3);
		InfrastructureSkill domainInfrastructureSkill3 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill4 = new InfrastructureSkill(4, "Debian", 3);
		// リクエスト
		List<InfrastructureSkill> requestDomainInfrastructureSkills = new ArrayList<>();
		requestDomainInfrastructureSkills.add(domainInfrastructureSkill1);
		requestDomainInfrastructureSkills.add(domainInfrastructureSkill2);
		InfrastructureSkillList requestDomainInfrastructureSkillList = new InfrastructureSkillList(
				requestDomainInfrastructureSkills);
		// レスポンス
		List<InfrastructureSkill> responseDomainInfrastructureSkills1 = new ArrayList<>();
		responseDomainInfrastructureSkills1.add(domainInfrastructureSkill1);
		responseDomainInfrastructureSkills1.add(domainInfrastructureSkill2);
		InfrastructureSkillList responseDomainInfrastructureSkillList1 = new InfrastructureSkillList(
				responseDomainInfrastructureSkills1);

		List<InfrastructureSkill> responseDomainInfrastructureSkills2 = new ArrayList<>();
		responseDomainInfrastructureSkills2.add(domainInfrastructureSkill3);
		responseDomainInfrastructureSkills2.add(domainInfrastructureSkill4);
		InfrastructureSkillList responseDomainInfrastructureSkillList2 = new InfrastructureSkillList(
				responseDomainInfrastructureSkills2);

		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 3);
		FrameworkSkill domainFrameworkSkill3 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill4 = new FrameworkSkill(4, "Spring Boot", 3);

		// リクエスト
		List<FrameworkSkill> requestDomainFrameworkSkills = new ArrayList<>();
		requestDomainFrameworkSkills.add(domainFrameworkSkill1);
		requestDomainFrameworkSkills.add(domainFrameworkSkill2);
		FrameworkSkillList requestDomainFrameworkSkillList = new FrameworkSkillList(
				requestDomainFrameworkSkills);

		// レスポンス
		List<FrameworkSkill> responseDomainFrameworkSkills1 = new ArrayList<>();
		responseDomainFrameworkSkills1.add(domainFrameworkSkill1);
		responseDomainFrameworkSkills1.add(domainFrameworkSkill2);
		FrameworkSkillList responseDomainFrameworkSkillList1 = new FrameworkSkillList(
				responseDomainFrameworkSkills1);
		List<FrameworkSkill> responseDomainFrameworkSkills2 = new ArrayList<>();
		responseDomainFrameworkSkills2.add(domainFrameworkSkill3);
		responseDomainFrameworkSkills2.add(domainFrameworkSkill4);
		FrameworkSkillList responseDomainFrameworkSkillList2 = new FrameworkSkillList(
				responseDomainFrameworkSkills2);

		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(3, "DynamoDB", 3);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, "MongoDB", 3);
		DatabaseSkill domainDatabaseSkill3 = new DatabaseSkill(3, "DynamoDB", 3);
		DatabaseSkill domainDatabaseSkill4 = new DatabaseSkill(4, "MongoDB", 3);

		// リクエスト
		List<DatabaseSkill> requestDomainDatabaseSkills = new ArrayList<>();
		requestDomainDatabaseSkills.add(domainDatabaseSkill1);
		requestDomainDatabaseSkills.add(domainDatabaseSkill2);
		DatabaseSkillList requestDomainDatabaseSkillList = new DatabaseSkillList(
				requestDomainDatabaseSkills);
		// レスポンス
		List<DatabaseSkill> responseDomainDatabaseSkills1 = new ArrayList<>();
		responseDomainDatabaseSkills1.add(domainDatabaseSkill1);
		responseDomainDatabaseSkills1.add(domainDatabaseSkill2);
		DatabaseSkillList responseDomainDatabaseSkillList1 = new DatabaseSkillList(
				responseDomainDatabaseSkills1);
		List<DatabaseSkill> responseDomainDatabaseSkills2 = new ArrayList<>();
		responseDomainDatabaseSkills2.add(domainDatabaseSkill3);
		responseDomainDatabaseSkills2.add(domainDatabaseSkill4);
		DatabaseSkillList responseDomainDatabaseSkillList2 = new DatabaseSkillList(
				responseDomainDatabaseSkills2);

		EmployeeBasicProfile employeeBasicProfile1 = new EmployeeBasicProfile(
				1,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント");

		EmployeeBasicProfile employeeBasicProfile2 = new EmployeeBasicProfile(
				2,
				"27",
				"中田",
				"あやか",
				"ナカタ",
				"アヤカ");

		// リクエスト
		EmployeeSkill employeeSkill = new EmployeeSkill(requestDomainProgrammingSkillList,
				requestDomainFrameworkSkillList, requestDomainDatabaseSkillList, requestDomainInfrastructureSkillList);

		// レスポンス
		EmployeeSkillSearch employeeSkillSearch1 = new EmployeeSkillSearch(employeeBasicProfile1,
				responseDomainProgrammingSkillList1, responseDomainFrameworkSkillList1,
				responseDomainDatabaseSkillList1, responseDomainInfrastructureSkillList1);

		EmployeeSkillSearch employeeSkillSearch2 = new EmployeeSkillSearch(employeeBasicProfile2,
				responseDomainProgrammingSkillList2, responseDomainFrameworkSkillList2,
				responseDomainDatabaseSkillList2, responseDomainInfrastructureSkillList2);

		List<EmployeeSkillSearch> employeeSkillSearchs = new ArrayList<>();
		employeeSkillSearchs.add(employeeSkillSearch1);
		employeeSkillSearchs.add(employeeSkillSearch2);

		EmployeeSkillSearchList employeeSkillSearchList = new EmployeeSkillSearchList(employeeSkillSearchs);

		when(employeeSkillSearchQueryServiceCoordinator.multiSkillFilter(employeeSkill))
				.thenReturn(employeeSkillSearchList);

		employeeSkillController.employeeSkillSearch(employeeSkill);
		verify(employeeSkillSearchQueryServiceCoordinator, times(1)).multiSkillFilter(employeeSkill);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// POST http://localhost:8080/api/v1/employees/skills/search

		// 前準備
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(3, "C言語", 3);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(4, "C#", 3);
		List<ProgrammingSkill> programmingSkills = new ArrayList<>();
		programmingSkills.add(domainProgrammingSkill1);
		programmingSkills.add(domainProgrammingSkill2);
		ProgrammingSkillList programmingSkillList = new ProgrammingSkillList(
				programmingSkills);

		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, "Debian", 3);
		List<InfrastructureSkill> infrastructureSkills = new ArrayList<>();
		infrastructureSkills.add(domainInfrastructureSkill1);
		infrastructureSkills.add(domainInfrastructureSkill2);
		InfrastructureSkillList infrastructureSkillList = new InfrastructureSkillList(
				infrastructureSkills);

		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 3);
		List<FrameworkSkill> frameworkSkills = new ArrayList<>();
		frameworkSkills.add(domainFrameworkSkill1);
		frameworkSkills.add(domainFrameworkSkill2);
		FrameworkSkillList frameworkSkillList = new FrameworkSkillList(
				frameworkSkills);

		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(3, "DynamoDB", 3);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, "MongoDB", 3);
		List<DatabaseSkill> databaseSkills = new ArrayList<>();
		databaseSkills.add(domainDatabaseSkill1);
		databaseSkills.add(domainDatabaseSkill2);
		DatabaseSkillList databaseSkillList = new DatabaseSkillList(databaseSkills);

		EmployeeSkill employeeSkill = new EmployeeSkill(programmingSkillList, frameworkSkillList,
				databaseSkillList, infrastructureSkillList);

		ObjectMapper objectMapper = new ObjectMapper();

		mvc.perform(MockMvcRequestBuilders.post("/api/v1/employees/skills/search")
				.content(objectMapper.writeValueAsString(employeeSkill))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

}