package com.employee.managementapi.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
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
@Sql("/employee_for_select_by_limit.sql")
public class EmployeeBasicProfileMapperTest {

	@Autowired
	private EmployeeBasicProfileMapper employeeBasicProfileMapper;

	@DisplayName("SELECT TEST: パラメーターstart:からlimit件数取得できる")
	@Test
	void testSelectByLimitSize() {
		List<EmployeeBasicProfile> actuals = employeeBasicProfileMapper.selectLimit(5, 2);
		assertEquals(2, actuals.size());
	}

	@DisplayName("SELECT TEST:任意の項目を取得できているか")
	@Test
	void testSelectByLimit() {
		List<EmployeeBasicProfile> actuals = employeeBasicProfileMapper.selectLimit(5, 2);
		EmployeeBasicProfile actual1 = actuals.get(0);
		EmployeeBasicProfile actual2 = actuals.get(1);
		assertEquals(26, actual1.getEmployeeId());
		assertEquals("26", actual1.getEmployeeCode());
		assertEquals("田嶋", actual1.getFamilyName());
		assertEquals("研人", actual1.getLastName());
		assertEquals("タジマ", actual1.getFamilyNameFurigana());
		assertEquals("ケント", actual1.getLastNameFurigana());
		assertEquals(27, actual2.getEmployeeId());
		assertEquals("27", actual2.getEmployeeCode());
		assertEquals("中田", actual2.getFamilyName());
		assertEquals("あやか", actual2.getLastName());
		assertEquals("ナカタ", actual2.getFamilyNameFurigana());
		assertEquals("アヤカ", actual2.getLastNameFurigana());
	}

	@DisplayName("SELECT TEST: 社員IDリストの社員IDに合致する社員基本情報を2件取得することが出来る")
	@Test
	void testSelectByEmployeeIdsSize() {
		EmployeeId employeeId1 = new EmployeeId(26);
		EmployeeId employeeId2 = new EmployeeId(27);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<EmployeeBasicProfile> actuals = employeeBasicProfileMapper.selectByEmployeeId(employeeIds);
		assertEquals(2, actuals.size());
	}

	@DisplayName("SELECT TEST: 社員IDリストの社員IDに合致する社員基本情報を取得することが出来る")
	@Test
	void testSelectByEmployeeIds() {
		EmployeeId employeeId1 = new EmployeeId(26);
		EmployeeId employeeId2 = new EmployeeId(27);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<EmployeeBasicProfile> actuals = employeeBasicProfileMapper.selectByEmployeeId(employeeIds);
		EmployeeBasicProfile actual1 = actuals.get(0);
		EmployeeBasicProfile actual2 = actuals.get(1);
		assertEquals(26, actual1.getEmployeeId());
		assertEquals("26", actual1.getEmployeeCode());
		assertEquals("田嶋", actual1.getFamilyName());
		assertEquals("研人", actual1.getLastName());
		assertEquals("タジマ", actual1.getFamilyNameFurigana());
		assertEquals("ケント", actual1.getLastNameFurigana());
		assertEquals(27, actual2.getEmployeeId());
		assertEquals("27", actual2.getEmployeeCode());
		assertEquals("中田", actual2.getFamilyName());
		assertEquals("あやか", actual2.getLastName());
		assertEquals("ナカタ", actual2.getFamilyNameFurigana());
		assertEquals("アヤカ", actual2.getLastNameFurigana());
	}

}
