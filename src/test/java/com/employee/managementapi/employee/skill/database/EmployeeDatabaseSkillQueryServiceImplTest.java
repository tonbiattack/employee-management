package com.employee.managementapi.employee.skill.database;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeeDatabaseSkillQueryServiceImplTest {

  @Mock
  private EmployeeDatabaseSkillMapper employeeDatabaseSkillMapper;

  @InjectMocks
  private EmployeeDatabaseSkillQueryServiceImpl employeeDatabaseSkillQueryServiceImpl;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @DisplayName("SELECT TEST: 社員のデータベーススキルが全て受け取れているのか")
  @Test
  public void testSelectAll() {
    EmployeeDatabaseSkill employeeDatabaseSkill1 = new EmployeeDatabaseSkill(9, 9, "9", "MySQL", 5);
    EmployeeDatabaseSkill employeeDatabaseSkill2 = new EmployeeDatabaseSkill(9, 6009, "9", "MySQL", 7);
    List<EmployeeDatabaseSkill> employeeDatabaseSkills = new ArrayList<>();
    employeeDatabaseSkills.add(employeeDatabaseSkill1);
    employeeDatabaseSkills.add(employeeDatabaseSkill2);
    when(employeeDatabaseSkillMapper.selectList()).thenReturn(employeeDatabaseSkills);

    EmployeeDatabaseSkillList actuals = employeeDatabaseSkillQueryServiceImpl.getList();
    assertEquals(2, actuals.size());
    verify(employeeDatabaseSkillMapper, times(1)).selectList();
  }
}
