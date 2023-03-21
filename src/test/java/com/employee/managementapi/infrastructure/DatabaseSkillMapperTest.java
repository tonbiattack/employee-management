package com.employee.managementapi.infrastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

import com.employee.managementapi.infrastructure.employee.DatabaseSkillMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/database_skill.sql")
public class DatabaseSkillMapperTest {

	@Autowired
	private DatabaseSkillMapper databaseSkillMapper;

	@DisplayName("SELECT TEST:シーケンスを取得できている")
	@Test
	void testsequence() {
		int actual = databaseSkillMapper.selectNextval();
		assertEquals(6, actual);
	}
}
