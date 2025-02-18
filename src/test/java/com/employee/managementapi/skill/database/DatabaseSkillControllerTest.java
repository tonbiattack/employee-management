
package com.employee.managementapi.skill.database;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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

public class DatabaseSkillControllerTest {

	private MockMvc mvc;

	@Mock
	private DatabaseSkillUpdateService databaseSkillNameUpdateService;

	@InjectMocks
	private DatabaseSkillController databaseSkillController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(databaseSkillController).build();
	}

	@DisplayName("CREATE TEST:databaseSkillが登録できているかどうか、登録した内容を返すことが出来ているか")
	@Test
	void testInsert() {
		DatabaseSkillName domainDatabaseSkillName = new DatabaseSkillName("Oracle Database");
		DatabaseSkillNameWithPrimaryKey domainDatabaseSkillNamelWithPrimaryKey = new DatabaseSkillNameWithPrimaryKey(6,
				"Oracle Database");
		when(databaseSkillNameUpdateService.insert(domainDatabaseSkillName))
				.thenReturn(domainDatabaseSkillNamelWithPrimaryKey);

		DatabaseSkillNameWithPrimaryKey response = databaseSkillController.insert(domainDatabaseSkillName);

		assertEquals(domainDatabaseSkillNamelWithPrimaryKey, response);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// POST http://localhost:8080/api/v1/skills/databases
		DatabaseSkillName domainDatabaseSkillName = new DatabaseSkillName("Oracle Database");
		ObjectMapper objectMapper = new ObjectMapper();

		mvc.perform(MockMvcRequestBuilders.post("/api/v1/skills/databases")
				.content(objectMapper.writeValueAsString(domainDatabaseSkillName))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isCreated());
	}

}
