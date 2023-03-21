package com.employee.managementapi.skill.database;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

import com.employee.managementapi.employee.EmployeeId;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee.sql")
@Sql("/database_skill.sql")
@Sql("/employee_database_skill.sql")
public class DomainDatabaseSkillMapperTest {

	@Autowired
	private DomainDatabaseSkillMapper domainDatabaseSkillMapper;

	@DisplayName("SELECT TEST: 検索条件 データベーススキルとデータベーススキルレベルを検索することができるか。2件のデータを返すことが出来ているか。")
	@Test
	public void testSelectEmployeeIdListBySkillsSize() {
		// 前処理
		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(3, null, 3);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, null, 3);
		List<DatabaseSkill> domainDatabaseSkills = new ArrayList<>();
		domainDatabaseSkills.add(domainDatabaseSkill1);
		domainDatabaseSkills.add(domainDatabaseSkill2);

		// 実行
		List<Integer> actuals = domainDatabaseSkillMapper
				.selectEmployeeIdListByFilterList(domainDatabaseSkills, domainDatabaseSkills.size());

		// 検証
		assertEquals(2, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 データベーススキルとデータベーススキルレベルを検索することができるか。該当する社員IDを返すことが出来るか。")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		// 前処理
		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(3, null, 3);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, null, 3);
		List<DatabaseSkill> domainDatabaseSkills = new ArrayList<>();
		domainDatabaseSkills.add(domainDatabaseSkill1);
		domainDatabaseSkills.add(domainDatabaseSkill2);

		// 実行
		List<Integer> actuals = domainDatabaseSkillMapper
				.selectEmployeeIdListByFilterList(domainDatabaseSkills, domainDatabaseSkills.size());
		int actual1 = actuals.get(0);
		int actual2 = actuals.get(1);

		// 検証
		assertEquals(1, actual1);
		assertEquals(2, actual2);
	}

	@DisplayName("SELECT TEST: 検索条件 データベーススキルを社員IDで検索することが出来る。4件のデータを返すことが出来ているか")
	@Test
	public void testSelectByEmployeeIdListSize() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);

		List<DatabaseSkill> actuals = domainDatabaseSkillMapper.selectListByEnployeeIdList(employeeIds);

		assertEquals(4, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 データベーススキルを社員IDで検索することが出来る。検索結果に該当するデータベーススキルを返却することが出来るか")
	@Test
	public void testSelectByEmployeeIdList() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);

		List<DatabaseSkill> actuals = domainDatabaseSkillMapper.selectListByEnployeeIdList(employeeIds);
		DatabaseSkill actual1 = actuals.get(0);
		DatabaseSkill actual2 = actuals.get(1);
		DatabaseSkill actual3 = actuals.get(2);
		DatabaseSkill actual4 = actuals.get(3);

		assertAll(
				() -> assertEquals(3, actual1.getDatabaseSkillId()),
				() -> assertEquals("DynamoDB", actual1.getDatabaseSkillName()),
				() -> assertEquals(10, actual1.getSkillLevel()),
				() -> assertEquals(4, actual2.getDatabaseSkillId()),
				() -> assertEquals("MongoDB", actual2.getDatabaseSkillName()),
				() -> assertEquals(5, actual2.getSkillLevel()),
				() -> assertEquals(3, actual3.getDatabaseSkillId()),
				() -> assertEquals("DynamoDB", actual3.getDatabaseSkillName()),
				() -> assertEquals(5, actual3.getSkillLevel()),
				() -> assertEquals(4, actual4.getDatabaseSkillId()),
				() -> assertEquals("MongoDB", actual4.getDatabaseSkillName()),
				() -> assertEquals(4, actual4.getSkillLevel()));

	}
}
