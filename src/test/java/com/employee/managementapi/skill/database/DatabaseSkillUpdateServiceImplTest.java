package com.employee.managementapi.skill.database;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.infrastructure.employee.DatabaseSkill;
import com.employee.managementapi.infrastructure.employee.DatabaseSkillMapper;

public class DatabaseSkillUpdateServiceImplTest {

	@Mock
	private DatabaseSkillMapper databaseSkillMapper;

	@InjectMocks
	private DatabaseSkillUpdateServiceImpl databaseSkillUpdateServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("CREATE TEST: databaseSkillが登録できているかどうか")
	@Test
	void testInsert() {
		DatabaseSkillNameWithPrimaryKey domainDatabaseSkillNamelWithPrimaryKey = new DatabaseSkillNameWithPrimaryKey(1,
				"Oracle Database");
		DatabaseSkillName databaseSkillName = new DatabaseSkillName("Oracle Database");
		when(databaseSkillMapper.insert(Mockito.any(DatabaseSkill.class))).thenReturn(1);
		when(databaseSkillMapper.selectNextval()).thenReturn(1);
		DatabaseSkillNameWithPrimaryKey actual = databaseSkillUpdateServiceImpl.insert(databaseSkillName);
		assertEquals(domainDatabaseSkillNamelWithPrimaryKey.getDatabaseSkillId(), actual.getDatabaseSkillId());
		assertEquals(domainDatabaseSkillNamelWithPrimaryKey.getDatabaseSkillName(), actual.getDatabaseSkillName());
		verify(databaseSkillMapper, times(1)).insert(Mockito.any(DatabaseSkill.class));
	}
}
