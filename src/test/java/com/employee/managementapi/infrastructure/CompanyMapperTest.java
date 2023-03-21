package com.employee.managementapi.infrastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

import com.employee.managementapi.infrastructure.employee.CompanyMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee.sql")
@Sql("/company.sql")
public class CompanyMapperTest {

	@Autowired
	private CompanyMapper companyMapper;

	@DisplayName("SELECT TEST:シーケンスを取得できている")
	@Test
	void testsequence() {
		int actual = companyMapper.selectNextval();
		// 既に10件のデータがインサートされているので
		assertEquals(11, actual);
	}
}
