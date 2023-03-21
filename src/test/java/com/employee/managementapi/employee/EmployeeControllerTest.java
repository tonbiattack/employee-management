package com.employee.managementapi.employee;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

public class EmployeeControllerTest {

	private MockMvc mvc;

	@Mock
	private EmployeeBasicProfileQueryService employeeBasicProfileQueryService;

	@Mock
	private EmployeeUpdateService employeeUpdateService;

	@InjectMocks
	private EmployeeController employeeController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(employeeController).build();
	}

	@DisplayName("SELECT TEST: 社員テーブルからパラメーターstart:からlimit件数取得できる")
	@Test
	public void testSelectByLimit() throws ParseException {
		EmployeeBasicProfile employeeBasicProfile1 = new EmployeeBasicProfile(
				26,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント");
		EmployeeBasicProfile employeeBasicProfile2 = new EmployeeBasicProfile(
				27,
				"27",
				"中田",
				"あやか",
				"ナカタ",
				"アヤカ");

		List<EmployeeBasicProfile> employeeBasicProfiles = new ArrayList<>();
		employeeBasicProfiles.add(employeeBasicProfile1);
		employeeBasicProfiles.add(employeeBasicProfile2);
		EmployeeBasicProfileList employeeBasicProfileList = new EmployeeBasicProfileList(employeeBasicProfiles);

		when(employeeBasicProfileQueryService.getListByLimit(5, 2)).thenReturn(employeeBasicProfileList);
		EmployeeBasicProfileList actuals = employeeController.getEmployeeBasicProfileList(6, 2);
		assertEquals(2, actuals.size());
		verify(employeeBasicProfileQueryService, times(1)).getListByLimit(5, 2);
	}

	@DisplayName("CREATE TEST:DomainemployeeがEmployeeテーブルに登録できているかどうか、DomainEmployeeを返すことが出来ているか")
	@Test
	void testInsert() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1971/11/25");
		com.employee.managementapi.employee.Employee employee = new com.employee.managementapi.employee.Employee(
				1,
				1,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント",
				date,
				1,
				"React,Vue.jsなどフロントエンドに詳しい。");
		EmployeeWithPrimaryKey employeeWithPrimaryKey = new EmployeeWithPrimaryKey(
				26,
				1,
				1,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント",
				date,
				1,
				"React,Vue.jsなどフロントエンドに詳しい。");
		when(employeeUpdateService.insert(employee)).thenReturn(employeeWithPrimaryKey);
		EmployeeWithPrimaryKey actual = employeeController.insert(employee);
		assertEquals(employeeWithPrimaryKey, actual);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// GET http://localhost:8080/api/v1/employees/basic-profiles?start=5&limit=2
		mvc.perform(MockMvcRequestBuilders.get("/api/v1/employees/basic-profiles?start=5&limit=2"))
				.andExpect(MockMvcResultMatchers.status().isOk());

		// POST http://localhost:8080/api/v1/employees
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1971/11/25");
		com.employee.managementapi.employee.Employee employee = new com.employee.managementapi.employee.Employee(
				1,
				1,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント",
				date,
				1,
				"React,Vue.jsなどフロントエンドに詳しい。");
		ObjectMapper objectMapper = new ObjectMapper();
		mvc.perform(MockMvcRequestBuilders.post("/api/v1/employees")
				.content(objectMapper.writeValueAsString(employee))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isCreated());
	}

}