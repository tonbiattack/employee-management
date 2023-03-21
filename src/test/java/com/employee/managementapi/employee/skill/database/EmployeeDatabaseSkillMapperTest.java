package com.employee.managementapi.employee.skill.database;

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
@Sql("/database_skill.sql")
@Sql("/employee_database_skill.sql")
public class EmployeeDatabaseSkillMapperTest {

    @Autowired
    private EmployeeDatabaseSkillMapper employeeDatabaseSkillMapper;

    @DisplayName("SELECT TEST: 全件取得できているかどうか")
    @Test
    public void testSelectAll() {
        List<EmployeeDatabaseSkill> actuals = employeeDatabaseSkillMapper.selectList();
        assertEquals(4, actuals.size());
    }

    @DisplayName("SELECT TEST: 任意の項目を取得できているのかどうか")
    @Test
    void testSelect() {
        List<EmployeeDatabaseSkill> actuals = employeeDatabaseSkillMapper.selectList();
        EmployeeDatabaseSkill actual1 = actuals.get(0);
        EmployeeDatabaseSkill actual2 = actuals.get(1);
        EmployeeDatabaseSkill actual3 = actuals.get(2);
        EmployeeDatabaseSkill actual4 = actuals.get(3);

        assertAll(
                () -> assertEquals(1, actual1.getEmployeeId()),
                () -> assertEquals("26", actual1.getEmployeeCode()),
                () -> assertEquals(1, actual1.getEmployeeDatabaseSkillId()),
                () -> assertEquals("DynamoDB", actual1.getDatabaseSkillName()),
                () -> assertEquals(10, actual1.getSkillLevel()),
                () -> assertEquals(1, actual2.getEmployeeId()),
                () -> assertEquals("26", actual2.getEmployeeCode()),
                () -> assertEquals(2, actual2.getEmployeeDatabaseSkillId()),
                () -> assertEquals("MongoDB", actual2.getDatabaseSkillName()),
                () -> assertEquals(5, actual2.getSkillLevel()),
                () -> assertEquals(2, actual3.getEmployeeId()),
                () -> assertEquals("27", actual3.getEmployeeCode()),
                () -> assertEquals(3, actual3.getEmployeeDatabaseSkillId()),
                () -> assertEquals("DynamoDB", actual3.getDatabaseSkillName()),
                () -> assertEquals(5, actual3.getSkillLevel()),
                () -> assertEquals(2, actual4.getEmployeeId()),
                () -> assertEquals("27", actual4.getEmployeeCode()),
                () -> assertEquals(4, actual4.getEmployeeDatabaseSkillId()),
                () -> assertEquals("MongoDB", actual4.getDatabaseSkillName()),
                () -> assertEquals(4, actual4.getSkillLevel()));
    }

    @DisplayName("UPDATE TEST: employee_database_skill.skill_levelが更新されるか")
    @Test
    void testUpdate() {
        EmployeeDatabaseSkill employeeDatabaseSkill = new EmployeeDatabaseSkill(1, 1, "26", "DynamoDB", 5);
        assertEquals(1, employeeDatabaseSkillMapper.update(employeeDatabaseSkill));
    }

    @DisplayName("DELETE TEST: データが削除されているか")
    @Test
    void testDelete() {
        assertEquals(1, employeeDatabaseSkillMapper.delete(1));
    }

}