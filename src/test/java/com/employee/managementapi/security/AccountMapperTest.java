package com.employee.managementapi.security;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee.sql")
@Sql("/employee_contact_information.sql")
@Sql("/active_employee_contact_information.sql")
@Sql("/password.sql")
@Sql("/role.sql")
@Sql("/ownership.sql")
public class AccountMapperTest {

	@Autowired
	private AccountMapper accountMapper;

	@DisplayName("SELECT TEST:アカウントの情報を正しく取得する事ができているか")
	@Test
	void testAccountByEmail() {
		Account actual = accountMapper.selectByEmail("hayamamasahiro@example.co.jp");

		assertAll(
				//一
				() -> assertEquals("hayamamasahiro@example.co.jp", actual.getCompanyEmail()),
				() -> assertEquals("$2a$10$emupGu/Iz8QfrgvxKnwbBOahRh8CI0Wl4gBl4EFSMn8UKt8JPjNdS", actual.getPassword()),
				//多
				() -> assertEquals("ROLE_ADMIN", actual.getRoleNameList().get(0).getRoleName()),
				() -> assertEquals("ROLE_SUPER_USER", actual.getRoleNameList().get(1).getRoleName()));
	}
	
	@DisplayName("SELECT TEST:アカウントの情報のロールネームを正しい件数取得することができているか")
	@Test
	void testAccountSizeByEmail() {
		Account actual = accountMapper.selectByEmail("hayamamasahiro@example.co.jp");

	assertEquals(2, actual.getRoleNameList().size());
	}

}
