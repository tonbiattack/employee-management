package com.employee.managementapi.employee.skill.infrastructure;

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
@Sql("/infrastructure_skill.sql")
@Sql("/employee_infrastructure_skill.sql")
public class EmployeeInfrastructureSkillMapperTest {

	@Autowired
	private EmployeeInfrastructureSkillMapper employeeInfrastructureSkillMapper;

	@DisplayName("SELECT TEST: 全件取得できているかどうか")
	@Test
	public void testSelectAll() {
		List<EmployeeInfrastructureSkill> actuals = employeeInfrastructureSkillMapper.selectList();
		assertEquals(4, actuals.size());
	}

	@DisplayName("SELECT TEST: 任意の項目を取得できているのかどうか")
	@Test
	void testSelect() {
		List<EmployeeInfrastructureSkill> actuals = employeeInfrastructureSkillMapper.selectList();
		EmployeeInfrastructureSkill actual1 = actuals.get(0);
		EmployeeInfrastructureSkill actual2 = actuals.get(1);
		EmployeeInfrastructureSkill actual3 = actuals.get(2);
		EmployeeInfrastructureSkill actual4 = actuals.get(3);

		assertAll(
				() -> assertEquals(1, actual1.getEmployeeId()),
				() -> assertEquals("26", actual1.getEmployeeCode()),
				() -> assertEquals(2, actual1.getEmployeeInfrastructureSkillId()),
				() -> assertEquals("AWS", actual1.getInfrastructureSkillName()),
				() -> assertEquals(6, actual1.getSkillLevel()),

				() -> assertEquals(1, actual2.getEmployeeId()),
				() -> assertEquals("26", actual2.getEmployeeCode()),
				() -> assertEquals(1, actual2.getEmployeeInfrastructureSkillId()),
				() -> assertEquals("Debian", actual2.getInfrastructureSkillName()),
				() -> assertEquals(6, actual2.getSkillLevel()),

				() -> assertEquals(2, actual3.getEmployeeId()),
				() -> assertEquals("27", actual3.getEmployeeCode()),
				() -> assertEquals(4, actual3.getEmployeeInfrastructureSkillId()),
				() -> assertEquals("AWS", actual3.getInfrastructureSkillName()),
				() -> assertEquals(3, actual3.getSkillLevel()),

				() -> assertEquals(2, actual4.getEmployeeId()),
				() -> assertEquals("27", actual4.getEmployeeCode()),
				() -> assertEquals(3, actual4.getEmployeeInfrastructureSkillId()),
				() -> assertEquals("Debian", actual4.getInfrastructureSkillName()),
				() -> assertEquals(4, actual4.getSkillLevel()));
	}
}
