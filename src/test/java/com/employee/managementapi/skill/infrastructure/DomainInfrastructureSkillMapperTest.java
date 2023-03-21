package com.employee.managementapi.skill.infrastructure;

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
@Sql("/infrastructure_skill.sql")
@Sql("/employee_infrastructure_skill.sql")
public class DomainInfrastructureSkillMapperTest {

	@Autowired
	private DomainInfrastructureSkillMapper domainInfrastructureSkillMapper;

	@DisplayName("SELECT TEST: 検索条件 インフラスキルとインフラスキルレベルを検索することができるか。2件のデータを返すことが出来ているか。")
	@Test
	public void testSelectEmployeeIdListBySkillsSize() {
		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, null, 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, null, 3);
		List<InfrastructureSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainInfrastructureSkill1);
		domainFrameworkSkills.add(domainInfrastructureSkill2);
		List<Integer> actuals = domainInfrastructureSkillMapper
				.selectEmployeeIdListByFilterList(domainFrameworkSkills, domainFrameworkSkills.size());
		assertEquals(2, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 インフラスキルとインフラスキルレベルを検索することができるか。該当する社員IDを返すことが出来るか。")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, null, 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, null, 3);
		List<InfrastructureSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainInfrastructureSkill1);
		domainFrameworkSkills.add(domainInfrastructureSkill2);
		List<Integer> actuals = domainInfrastructureSkillMapper
				.selectEmployeeIdListByFilterList(domainFrameworkSkills, domainFrameworkSkills.size());
		int actual1 = actuals.get(0);
		int actual2 = actuals.get(1);
		assertEquals(1, actual1);
		assertEquals(2, actual2);
	}

	@DisplayName("SELECT TEST: 検索条件 インフラスキルを社員IDで検索することが出来る。4件のデータを返すことが出来ているか")
	@Test
	public void testSelectByEmployeeIdListSize() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<InfrastructureSkill> actuals = domainInfrastructureSkillMapper
				.selectListByEnployeeIdList(employeeIds);
		assertEquals(4, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 インフラスキルを社員IDで検索することが出来る。検索結果に該当するインフラスキルを返却することが出来るか")
	@Test
	public void testSelectByEmployeeIdList() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<InfrastructureSkill> actuals = domainInfrastructureSkillMapper
				.selectListByEnployeeIdList(employeeIds);
		InfrastructureSkill actual1 = actuals.get(0);
		InfrastructureSkill actual2 = actuals.get(1);
		InfrastructureSkill actual3 = actuals.get(2);
		InfrastructureSkill actual4 = actuals.get(3);
		assertAll(
				() -> assertEquals(3, actual1.getInfrastructureSkillId()),
				() -> assertEquals("AWS", actual1.getInfrastructureSkillName()),
				() -> assertEquals(6, actual1.getSkillLevel()),
				() -> assertEquals(4, actual2.getInfrastructureSkillId()),
				() -> assertEquals("Debian", actual2.getInfrastructureSkillName()),
				() -> assertEquals(6, actual2.getSkillLevel()),
				() -> assertEquals(3, actual3.getInfrastructureSkillId()),
				() -> assertEquals("AWS", actual3.getInfrastructureSkillName()),
				() -> assertEquals(3, actual3.getSkillLevel()),
				() -> assertEquals(4, actual4.getInfrastructureSkillId()),
				() -> assertEquals("Debian", actual4.getInfrastructureSkillName()),
				() -> assertEquals(4, actual4.getSkillLevel()));
	}
}
