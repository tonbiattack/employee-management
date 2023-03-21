package com.employee.managementapi.employee.skill.framework;

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

public class EmployeeFrameworkSkillQueryServiceImplTest {

  @Mock
  private EmployeeFrameworkSkillMapper employeeFrameworkSkillMapper;
  @InjectMocks
  private EmployeeFrameworkSkillQueryServiceImpl employeeFrameworkSkillQueryServiceImpl;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @DisplayName("SELECT TEST: 社員のフレームワークスキルが全て受け取れているのか")
  @Test
  public void testSelectAll() {
    EmployeeFrameworkSkill employeeFrameworkSkill1 = new EmployeeFrameworkSkill(9, 9, "9", "Ruby on Rails", 4);
    EmployeeFrameworkSkill employeeFrameworkSkill2 = new EmployeeFrameworkSkill(9, 6009, "9", "FastAPI", 6);

    List<EmployeeFrameworkSkill> employeeFrameworkSkills = new ArrayList<>();
    employeeFrameworkSkills.add(employeeFrameworkSkill1);
    employeeFrameworkSkills.add(employeeFrameworkSkill2);
    when(employeeFrameworkSkillMapper.selectList()).thenReturn(employeeFrameworkSkills);

    EmployeeFrameworkSkillList actuals = employeeFrameworkSkillQueryServiceImpl.getList();
    assertEquals(2, actuals.size());
    verify(employeeFrameworkSkillMapper, times(1)).selectList();
  }
}
