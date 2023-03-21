package com.employee.managementapi.security;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.exception.BadRequestException;

/**
 * 認証登録サービステスト
 */
@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthUpdateServiceCoordinatorImplTest {

	@Autowired
	private AuthUpdateServiceCoordinator authUpdateServiceCoordinator;

	@Sql("/init.sql")
	@Sql("/employee_status.sql")
	@Sql("/gender.sql")
	@Sql("/employee.sql")
	@Sql("/employee_contact_information_for_account_register.sql")
	@Sql("/active_employee_contact_information_for_account_register.sql")
	@Sql("/role.sql")
	@DisplayName("CREATE TEST:パスワードを登録することができているか")
	@Test
	public void tesRegister() {
		SignUpDto signUpDto = new SignUpDto("sano222@example.org", "test", "ADMIN");
		SignUpDtoWithPrimaryKey signUpDtoWithPrimaryKey = new SignUpDtoWithPrimaryKey(1, 1, "sano222@example.org",
				"test", "ADMIN");
		SignUpDtoWithPrimaryKey actual = authUpdateServiceCoordinator.registerUser(signUpDto);
		assertAll(
				() -> assertEquals(signUpDtoWithPrimaryKey.getCompanyEmail(),
						actual.getCompanyEmail()),
				() -> assertEquals(signUpDtoWithPrimaryKey.getPassword(),
						actual.getPassword()),
				() -> assertEquals(signUpDtoWithPrimaryKey.getRoleName(),
						actual.getRoleName()),
				() -> assertEquals(signUpDtoWithPrimaryKey.getOwnershipId(),
						actual.getOwnershipId()),
				() -> assertEquals(signUpDtoWithPrimaryKey.getPasswordId(),
						actual.getPasswordId()));
	}

	@Nested
	@Sql("/init.sql")
	@Sql("/employee_status.sql")
	@Sql("/gender.sql")
	@Sql("/employee.sql")
	@Sql("/employee_contact_information_for_account_register.sql")
	@Sql("/active_employee_contact_information_for_account_register.sql")
	@Sql("/role.sql")
	@Sql("/password.sql")
	class exception {
		@DisplayName("ERROR TEST:メールアドレスが登録されていない場合、BadRequestExceptionを返すか。エラーメッセージは適切か")
		@Test
		void testAlreadyExistsCompanyEmailAsCompanyEmail() {
			//メールアドレスが登録されていない
			SignUpDto notRegisteredEmail = new SignUpDto("error@example.org", "test", "ADMIN");
			BadRequestException exception = assertThrows(BadRequestException.class, () -> {
				authUpdateServiceCoordinator.registerUser(notRegisteredEmail);
			});

			assertAll(
					() -> assertThrows(BadRequestException.class,
							() -> authUpdateServiceCoordinator.registerUser(notRegisteredEmail)),
					() -> assertEquals(exception.getMessage(), "入力されたメールアドレス:error@example.orgは登録されていません。"));
		}

		@DisplayName("ERROR TEST:メールアドレスがパスワードととして既に登録されている場合、BadRequestExceptionを返すか。エラーメッセージは適切か")
		@Test
		void testAlreadyExistsEmailAsPassword() {
			//メールアドレスがパスワードととして既に登録されている
			SignUpDto alreadyExistsEmailAsPassword = new SignUpDto("hayamamasahiro@example.co.jp", "test", "ADMIN");
			BadRequestException exception = assertThrows(BadRequestException.class, () -> {
				authUpdateServiceCoordinator.registerUser(alreadyExistsEmailAsPassword);
			});
			assertAll(
					() -> assertThrows(BadRequestException.class,
							() -> authUpdateServiceCoordinator.registerUser(alreadyExistsEmailAsPassword)),
					() -> assertEquals(exception.getMessage(),
							"入力されたメールアドレス:hayamamasahiro@example.co.jpは既に登録されています。"));

		}

		@DisplayName("ERROR TEST:ロールネームが登録されていない場合、BadRequestExceptionを返すか。エラーメッセージは適切か")
		@Test
		void testExistsRole() {
			//ロールネームが登録されていない
			SignUpDto notExistsRole = new SignUpDto("sano222@example.org", "test", "FALSE");
			BadRequestException exception = assertThrows(BadRequestException.class, () -> {
				authUpdateServiceCoordinator.registerUser(notExistsRole);
			});

			assertAll(
					() -> assertThrows(BadRequestException.class,
							() -> authUpdateServiceCoordinator.registerUser(notExistsRole)),
					() -> assertEquals(exception.getMessage(), "入力されたロール:FALSEは存在しません。"));
		}

	}
}
