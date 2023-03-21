package com.employee.managementapi.employee.skill.programming;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
@Sql("/programming_skill.sql")
@Sql("/employee_programming_skill.sql")
public class EmployeeProgrammingSkillMapperTest {

	@Autowired
	private EmployeeProgrammingSkillMapper employeeProgrammingSkillMapper;

	@DisplayName("SELECT TEST: 全件取得できているかどうかの")
	@Test
	public void testSelectAll() {
		List<EmployeeProgrammingSkill> actuals = employeeProgrammingSkillMapper.selectList();
		assertEquals(4, actuals.size());
	}

	@DisplayName("SELECT TEST: 任意の項目を取得できているのかどうか")
	@Test
	void testSelect() {
		List<EmployeeProgrammingSkill> actuals = employeeProgrammingSkillMapper.selectList();

		EmployeeProgrammingSkill actual1 = actuals.get(0);
		EmployeeProgrammingSkill actual2 = actuals.get(1);
		EmployeeProgrammingSkill actual3 = actuals.get(2);
		EmployeeProgrammingSkill actual4 = actuals.get(3);
		assertAll(
				() -> assertEquals(1, actual1.getEmployeeId()),
				() -> assertEquals("26", actual1.getEmployeeCode()),
				() -> assertEquals(2, actual1.getEmployeeProgrammingSkillId()),
				() -> assertEquals("C言語", actual1.getProgrammingSkillName()),
				() -> assertEquals(9, actual1.getSkillLevel()),

				() -> assertEquals(1, actual2.getEmployeeId()),
				() -> assertEquals("26", actual2.getEmployeeCode()),
				() -> assertEquals(1, actual2.getEmployeeProgrammingSkillId()),
				() -> assertEquals("C#", actual2.getProgrammingSkillName()),
				() -> assertEquals(8, actual2.getSkillLevel()),

				() -> assertEquals(2, actual3.getEmployeeId()),
				() -> assertEquals("27", actual3.getEmployeeCode()),
				() -> assertEquals(4, actual3.getEmployeeProgrammingSkillId()),
				() -> assertEquals("C言語", actual3.getProgrammingSkillName()),
				() -> assertEquals(4, actual3.getSkillLevel()),

				() -> assertEquals(2, actual4.getEmployeeId()),
				() -> assertEquals("27", actual4.getEmployeeCode()),
				() -> assertEquals(3, actual4.getEmployeeProgrammingSkillId()),
				() -> assertEquals("C#", actual4.getProgrammingSkillName()),
				() -> assertEquals(4, actual4.getSkillLevel()));
	}
}
