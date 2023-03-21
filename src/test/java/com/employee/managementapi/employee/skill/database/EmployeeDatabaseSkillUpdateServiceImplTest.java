package com.employee.managementapi.employee.skill.database;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeeDatabaseSkillUpdateServiceImplTest {

	@Mock
	private EmployeeDatabaseSkillMapper employeeDatabaseSkillMapper;

	@InjectMocks
	private EmployeeDatabaseSkillUpdateServiceImpl employeeDatabaseSkillUpdateServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("UPDATE TEST:社員データベーススキルが更新されているかどうか")
	@Test
	public void testUpdate() {
		EmployeeDatabaseSkill employeeDatabaseSkill = new EmployeeDatabaseSkill(9, 9, "9", "MySQL", 5);
		when(employeeDatabaseSkillMapper.update(any(EmployeeDatabaseSkill.class))).thenReturn(1);
		EmployeeDatabaseSkill actual = employeeDatabaseSkillUpdateServiceImpl.update(employeeDatabaseSkill);
		assertEquals(employeeDatabaseSkill, actual);
		verify(employeeDatabaseSkillMapper, times(1)).update(employeeDatabaseSkill);
	}

	@DisplayName("DELETE TEST: 社員データベーススキルを削除出来ているかどうか")
	@Test
	void testDelete() {
		int employeeDatabaseSkillId = 9;
		when(employeeDatabaseSkillMapper.delete(employeeDatabaseSkillId)).thenReturn(1);

		employeeDatabaseSkillUpdateServiceImpl.delete(employeeDatabaseSkillId);
		verify(employeeDatabaseSkillMapper, times(1)).delete(employeeDatabaseSkillId);
	}
}
