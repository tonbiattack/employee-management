package com.employee.managementapi.skill.programming;

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
@Sql("/programming_skill.sql")
@Sql("/employee_programming_skill.sql")
public class DomainProgrammingSkillMapperTest {

	@Autowired
	private DomainProgrammingSkillMapper domainProgrammingSkillMapper;

	@DisplayName("SELECT TEST: 検索条件 プログラムスキルとプログラムスキルレベルを検索することができるか。2件のデータを返すことが出来ているか。")
	@Test
	public void testSelectEmployeeIdListBySkillsSize() {
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(3, null, 3);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(4, null, 3);
		List<ProgrammingSkill> domainProgrammingSkills = new ArrayList<>();
		domainProgrammingSkills.add(domainProgrammingSkill1);
		domainProgrammingSkills.add(domainProgrammingSkill2);
		List<Integer> actuals = domainProgrammingSkillMapper
				.selectEmployeeIdListByFilterList(domainProgrammingSkills, domainProgrammingSkills.size());
		assertEquals(2, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 プログラムスキルとプログラムスキルレベルを検索することができるか。該当する社員IDを返すことが出来るか。")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(3, null, 3);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(4, null, 3);
		List<ProgrammingSkill> domainProgrammingSkills = new ArrayList<>();
		domainProgrammingSkills.add(domainProgrammingSkill1);
		domainProgrammingSkills.add(domainProgrammingSkill2);
		List<Integer> actuals = domainProgrammingSkillMapper
				.selectEmployeeIdListByFilterList(domainProgrammingSkills, domainProgrammingSkills.size());
		int actual1 = actuals.get(0);
		int actual2 = actuals.get(1);
		assertEquals(1, actual1);
		assertEquals(2, actual2);
	}

	@DisplayName("SELECT TEST: 検索条件 プログラミングスキルを社員IDで検索することが出来る。4件のデータを返すことが出来ているか")
	@Test
	public void testSelectByEmployeeIdListSize() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<ProgrammingSkill> actuals = domainProgrammingSkillMapper.selectListByEnployeeIdList(employeeIds);
		assertEquals(4, actuals.size());
	}

	@DisplayName("SELECT TEST: 検索条件 プログラミングスキルを社員IDで検索することが出来る。検索結果に該当するプログラミングスキルを返却することが出来るか")
	@Test
	public void testSelectByEmployeeIdList() {
		EmployeeId employeeId1 = new EmployeeId(1);
		EmployeeId employeeId2 = new EmployeeId(2);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		List<ProgrammingSkill> actuals = domainProgrammingSkillMapper.selectListByEnployeeIdList(employeeIds);
		ProgrammingSkill actual1 = actuals.get(0);
		ProgrammingSkill actual2 = actuals.get(1);
		ProgrammingSkill actual3 = actuals.get(2);
		ProgrammingSkill actual4 = actuals.get(3);
		assertAll(
				() -> assertEquals(3, actual1.getProgrammingSkillId()),
				() -> assertEquals("C言語", actual1.getProgrammingSkillName()),
				() -> assertEquals(9, actual1.getSkillLevel()),
				() -> assertEquals(4, actual2.getProgrammingSkillId()),
				() -> assertEquals("C#", actual2.getProgrammingSkillName()),
				() -> assertEquals(8, actual2.getSkillLevel()),
				() -> assertEquals(3, actual3.getProgrammingSkillId()),
				() -> assertEquals("C言語", actual3.getProgrammingSkillName()),
				() -> assertEquals(4, actual3.getSkillLevel()),
				() -> assertEquals(4, actual4.getProgrammingSkillId()),
				() -> assertEquals("C#", actual4.getProgrammingSkillName()),
				() -> assertEquals(4, actual4.getSkillLevel()));
	}
}
