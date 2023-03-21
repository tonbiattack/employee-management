package com.employee.managementapi.skill.framework;

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
@Sql("/framework_skill.sql")
@Sql("/employee_framework_skill.sql")
public class DomainFrameworkSkillMapperTest {

	@Autowired
	private DomainFrameworkSkillMapper domainFrameworkSkillMapper;

	@DisplayName("SELECT TEST: 検索条件 フレームワークスキルとフレームワークスキルレベルを検索することができるか。2件のデータを返すことが出来ているか。")
	@Test
	public void testSelectEmployeeIdListBySkillsSize() {
		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, null, 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, null, 3);
		List<FrameworkSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainFrameworkSkill1);
		domainFrameworkSkills.add(domainFrameworkSkill2);
		List<Integer> actuals = domainFrameworkSkillMapper
				.selectEmployeeIdListByFilterList(domainFrameworkSkills, domainFrameworkSkills.size());
		assertEquals(2, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 フレームワークスキルとフレームワークスキルレベルを検索することができるか。該当する社員IDを返すことが出来るか。")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, null, 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, null, 3);
		List<FrameworkSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainFrameworkSkill1);
		domainFrameworkSkills.add(domainFrameworkSkill2);

		List<Integer> actuals = domainFrameworkSkillMapper
				.selectEmployeeIdListByFilterList(domainFrameworkSkills, domainFrameworkSkills.size());

		int actual1 = actuals.get(0);
		int actual2 = actuals.get(1);
		assertEquals(1, actual1);
		assertEquals(2, actual2);
	}

	@DisplayName("SELECT TEST: 検索条件 フレームワークスキルを社員IDで検索することが出来る。4件のデータを返すことが出来ているか")
	@Test
	public void testSelectByEmployeeIdListSize() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);

		List<FrameworkSkill> actuals = domainFrameworkSkillMapper.selectListByEnployeeIdList(employeeIds);

		assertEquals(4, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 フレームワークスキルを社員IDで検索することが出来る。検索結果に該当するフレームワークスキルを返却することが出来るか")
	@Test
	public void testSelectByEmployeeIdList() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<FrameworkSkill> actuals = domainFrameworkSkillMapper.selectListByEnployeeIdList(employeeIds);
		FrameworkSkill actual1 = actuals.get(0);
		FrameworkSkill actual2 = actuals.get(1);
		FrameworkSkill actual3 = actuals.get(2);
		FrameworkSkill actual4 = actuals.get(3);

		assertAll(
				() -> assertEquals(3, actual1.getFrameworkSkillId()),
				() -> assertEquals("Angular", actual1.getFrameworkSkillName()),
				() -> assertEquals(5, actual1.getSkillLevel()),
				() -> assertEquals(4, actual2.getFrameworkSkillId()),
				() -> assertEquals("Spring Boot", actual2.getFrameworkSkillName()),
				() -> assertEquals(5, actual2.getSkillLevel()),
				() -> assertEquals(3, actual3.getFrameworkSkillId()),
				() -> assertEquals("Angular", actual3.getFrameworkSkillName()),
				() -> assertEquals(3, actual3.getSkillLevel()),
				() -> assertEquals(4, actual4.getFrameworkSkillId()),
				() -> assertEquals("Spring Boot", actual4.getFrameworkSkillName()),
				() -> assertEquals(8, actual4.getSkillLevel()));
	}
}
