
package com.employee.managementapi.employee.cycle.joining;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class JoiningTheCompanyControllerTest {

	private MockMvc mvc;

	@Mock
	private JoiningTheCompanyUpdateService joiningTheCompanyUpdateService;

	@InjectMocks
	private JoiningTheCompanyController joiningTheCompanyController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(joiningTheCompanyController).build();

	}

	@DisplayName("CREATE TEST:databaseSkillが登録できているかどうか、登録した内容を返すことが出来ているか")
	@Test
	void testInsert() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1993/06/01");

		JoiningTheCompany domainJoiningTheCompany = new JoiningTheCompany(1, date);
		JoiningTheCompanyWithPrimaryKey domainJoiningTheCompanyWithPrimaryKey = new JoiningTheCompanyWithPrimaryKey(
				1, 1, date);
		when(joiningTheCompanyUpdateService.insert(domainJoiningTheCompany))
				.thenReturn(domainJoiningTheCompanyWithPrimaryKey);

		JoiningTheCompanyWithPrimaryKey response = joiningTheCompanyController.insert(domainJoiningTheCompany);

		assertEquals(domainJoiningTheCompanyWithPrimaryKey, response);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// http://localhost:8080/api/v1/employees/cycles/joinings
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1993/06/01");
		JoiningTheCompany domainJoiningTheCompany = new JoiningTheCompany(1, date);
		ObjectMapper objectMapper = new ObjectMapper();
		mvc.perform(MockMvcRequestBuilders.post("/api/v1/employees/cycles/joinings")
				.content(objectMapper.writeValueAsString(domainJoiningTheCompany))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isCreated());

	}
}
