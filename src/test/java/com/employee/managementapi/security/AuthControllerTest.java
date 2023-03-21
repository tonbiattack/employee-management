
package com.employee.managementapi.security;

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

public class AuthControllerTest {

	private MockMvc mvc;

	@Mock
	private AuthUpdateServiceCoordinator authUpdateServiceCoordinator;

	@Mock
	private AuthQueryServiceCoordinator authQueryServiceCoordinator;

	@InjectMocks
	private AuthController authController;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(authController).build();
	}

	@DisplayName("CREATE TEST:アカウントが登録できているかどうか、登録した内容を返すことが出来ているか")
	@Test
	void testRegister() {
		SignUpDto signUpDto = new SignUpDto("sano222@example.org", "test", "ADMIN");
		authController.registerUser(signUpDto);
		SignUpDtoWithPrimaryKey signUpDtoWithPrimaryKey = new SignUpDtoWithPrimaryKey(1, 1, "sano222@example.org",
				"test", "ADMIN");
		when(authUpdateServiceCoordinator.registerUser(signUpDto)).thenReturn(signUpDtoWithPrimaryKey);

		SignUpDtoWithPrimaryKey response = authController.registerUser(signUpDto);
		assertEquals(signUpDtoWithPrimaryKey, response);
	}

	@DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
	@Test
	void testApi() throws Exception {
		// POST http://localhost:8080/api/v1/auth/signup
		SignUpDto signUpDto = new SignUpDto("sano222@example.org", "test", "ADMIN");
		ObjectMapper objectMapper = new ObjectMapper();

		mvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/signup")
				.content(objectMapper.writeValueAsString(signUpDto))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isCreated());

		// POST http://localhost:8080/api/v1/auth/signin
		SignInDto signInDto = new SignInDto("sano222@example.org", "test");

		mvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/signin")
				.content(objectMapper.writeValueAsString(signInDto))
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

}
