package com.employee.managementapi.skill.database;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.employee.EmployeeId;
import com.employee.managementapi.employee.EmployeeIdList;

public class DatabaseSkillQueryServiceImplTest {

	@Mock
	private DomainDatabaseSkillMapper domainDatabaseSkillMapper;

	@InjectMocks
	private DatabaseSkillQueryServiceImpl databaseSkillQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: データベーススキルを受け取り、該当する社員IDを返すことが出来ているか")
	@Test
	public void testSelectEmployeeIdListBySkills() {
		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(3, null, 3);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, null, 8);
		List<DatabaseSkill> domainDatabaseSkills = new ArrayList<>();
		domainDatabaseSkills.add(domainDatabaseSkill1);
		domainDatabaseSkills.add(domainDatabaseSkill2);
		DatabaseSkillList databaseSkillList = new DatabaseSkillList(domainDatabaseSkills);
		List<Integer> employeeIdList = new ArrayList<>();
		employeeIdList.add(19);
		employeeIdList.add(89);

		when(domainDatabaseSkillMapper.selectEmployeeIdListByFilterList(domainDatabaseSkills,
				domainDatabaseSkills.size())).thenReturn(employeeIdList);

		EmployeeIdList actuals = databaseSkillQueryServiceImpl
				.getEmployeeIdListByFilterDatabaseSkillList(databaseSkillList);
		assertEquals(2, actuals.size());
		verify(domainDatabaseSkillMapper, times(1))
				.selectEmployeeIdListByFilterList(domainDatabaseSkills, domainDatabaseSkills.size());
	}

	@DisplayName("SELECT TEST: 社員ID一覧を受け取り、社員IDのデータベーススキルを返す")
	@Test
	public void testSelectListByEmployeeIdList() {

		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(4, "MongoDB", 10);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, "MongoDB", 5);
		DatabaseSkill domainDatabaseSkill3 = new DatabaseSkill(3, "DynamoDb", 5);
		DatabaseSkill domainDatabaseSkill4 = new DatabaseSkill(4, "MongoDB", 4);
		List<DatabaseSkill> domainDatabaseSkills = new ArrayList<>();
		domainDatabaseSkills.add(domainDatabaseSkill1);
		domainDatabaseSkills.add(domainDatabaseSkill2);
		domainDatabaseSkills.add(domainDatabaseSkill3);
		domainDatabaseSkills.add(domainDatabaseSkill4);
		EmployeeId employeeId1 = new EmployeeId(38);
		EmployeeId employeeId2 = new EmployeeId(72);
		List<EmployeeId> employeeIds = new ArrayList<>();
		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		EmployeeIdList employeeIdList = new EmployeeIdList(employeeIds);
		when(domainDatabaseSkillMapper.selectListByEnployeeIdList(employeeIds)).thenReturn(domainDatabaseSkills);

		DatabaseSkillList actuals = databaseSkillQueryServiceImpl
				.getListByEnployeeIdList(employeeIdList);

		assertEquals(4, actuals.size());

		verify(domainDatabaseSkillMapper, times(1))
				.selectListByEnployeeIdList(employeeIds);
	}

}
