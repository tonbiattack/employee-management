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
@Sql("/role.sql")
public class RoleNameMapperTest {

	@Autowired
	private RoleNameMapper roleNameMapper;

	@DisplayName("SELECT TEST:ロールネームで検索することができる、検索結果に該当した件数を返すことができる")
	@Test
	void testCountByRole() {
		RoleName roleName = new RoleName("ADMIN");
		int actual = roleNameMapper.countByRole(roleName);
		assertEquals(1, actual);
	}
}
