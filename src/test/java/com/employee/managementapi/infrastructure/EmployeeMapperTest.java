package com.employee.managementapi.infrastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

import com.employee.managementapi.infrastructure.employee.EmployeeMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee_for_select_by_limit.sql")
public class EmployeeMapperTest {

	@Autowired
	private EmployeeMapper employeeMapper;

	@DisplayName("SELECT TEST:シーケンスを取得できている")
	@Test
	void testsequence() {
		int actual = employeeMapper.selectNextval();
		// 既に28件のデータがインサートされているので
		assertEquals(28, actual);
	}
}
