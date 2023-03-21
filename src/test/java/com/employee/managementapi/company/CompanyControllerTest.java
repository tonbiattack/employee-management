package com.employee.managementapi.company;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;

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

public class CompanyControllerTest {

	private MockMvc mvc;

	@Mock
	private CompanyUpdateService companyUpdateService;

	@InjectMocks
	private CompanyController companyController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(companyController).build();

	}

	@DisplayName("CREATE TEST:Company(会社が登録できているかどうか、登録した情報を返却できているか")
	@Test
	void testInsert() throws ParseException {
		Company domainCompany = new Company("1", "有限会社インフィニティ",
				"インフラの運用保守");
		CompanyWithPrimaryKey domainCompanyWithPrimaryKey = new CompanyWithPrimaryKey(1, "1", "有限会社インフィニティ",
				"インフラの運用保守");
		when(companyUpdateService.insert(domainCompany)).thenReturn(domainCompanyWithPrimaryKey);
		CompanyWithPrimaryKey response = companyController.insert(domainCompany);
		assertEquals(domainCompanyWithPrimaryKey, response);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// POST http://localhost:8080/api/v1/companys
		Company domainCompany = new Company("1", "有限会社インフィニティ",
				"インフラの運用保守");
		ObjectMapper objectMapper = new ObjectMapper();
		mvc.perform(MockMvcRequestBuilders.post("/api/v1/companys")
				.content(objectMapper.writeValueAsString(domainCompany))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isCreated());
	}
}
