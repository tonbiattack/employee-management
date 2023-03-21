package com.employee.managementapi.employee.skill.framework;

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
@Sql("/framework_skill.sql")
@Sql("/employee_framework_skill.sql")
public class EmployeeFrameworkSkillMapperTest {

    @Autowired
    private EmployeeFrameworkSkillMapper employeeFrameworkSkillMapper;

    @DisplayName("SELECT TEST: 全件取得できているかどうか")
    @Test
    public void testSelectAll() {
        List<EmployeeFrameworkSkill> actuals = employeeFrameworkSkillMapper.selectList();
        assertEquals(4, actuals.size());
    }

    @DisplayName("SELECT TEST: 任意の項目を取得できているのかどうか")
    @Test
    void testSelect() {
        List<EmployeeFrameworkSkill> actuals = employeeFrameworkSkillMapper.selectList();
        EmployeeFrameworkSkill actual1 = actuals.get(0);
        EmployeeFrameworkSkill actual2 = actuals.get(1);
        EmployeeFrameworkSkill actual3 = actuals.get(2);
        EmployeeFrameworkSkill actual4 = actuals.get(3);
        assertAll(
                () -> assertEquals(1, actual1.getEmployeeId()),
                () -> assertEquals("26", actual1.getEmployeeCode()),
                () -> assertEquals(2, actual1.getEmployeeFrameworkSkillId()),
                () -> assertEquals("Angular", actual1.getFrameworkSkillName()),
                () -> assertEquals(5, actual1.getSkillLevel()),

                () -> assertEquals(1, actual2.getEmployeeId()),
                () -> assertEquals("26", actual2.getEmployeeCode()),
                () -> assertEquals(1, actual2.getEmployeeFrameworkSkillId()),
                () -> assertEquals("Spring Boot", actual2.getFrameworkSkillName()),
                () -> assertEquals(5, actual2.getSkillLevel()),

                () -> assertEquals(2, actual3.getEmployeeId()),
                () -> assertEquals("27", actual3.getEmployeeCode()),
                () -> assertEquals(4, actual3.getEmployeeFrameworkSkillId()),
                () -> assertEquals("Angular", actual3.getFrameworkSkillName()),
                () -> assertEquals(3, actual3.getSkillLevel()),

                () -> assertEquals(2, actual4.getEmployeeId()),
                () -> assertEquals("27", actual4.getEmployeeCode()),
                () -> assertEquals(3, actual4.getEmployeeFrameworkSkillId()),
                () -> assertEquals("Spring Boot", actual4.getFrameworkSkillName()),
                () -> assertEquals(8, actual4.getSkillLevel()));
    }
}
