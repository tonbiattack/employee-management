package com.employee.managementapi.employee.skill.programming;

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

public class EmployeeProgrammingSkillQueryServiceImplTest {

    @Mock
    private EmployeeProgrammingSkillMapper employeeProgrammingSkillMapper;

    @InjectMocks
    private EmployeeProgrammingSkillQueryServiceImpl employeeProgrammingSkillQueryServiceImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @DisplayName("SELECT TEST: 社員のプログラムスキルが全て受け取れているのか")
    @Test
    public void testSelectAll() {
        EmployeeProgrammingSkill employeeProgrammingSkill1 = new EmployeeProgrammingSkill(9, 9, "9",
                "TypeScript", 6);
        EmployeeProgrammingSkill employeeProgrammingSkill2 = new EmployeeProgrammingSkill(9, 6009, "9",
                "C言語", 1);
        List<EmployeeProgrammingSkill> employeeProgrammingSkills = new ArrayList<>();
        employeeProgrammingSkills.add(employeeProgrammingSkill1);
        employeeProgrammingSkills.add(employeeProgrammingSkill2);
        when(employeeProgrammingSkillMapper.selectList()).thenReturn(employeeProgrammingSkills);

        EmployeeProgrammingSkillList actuals = employeeProgrammingSkillQueryServiceImpl.getList();

        assertEquals(2, actuals.size());
        verify(employeeProgrammingSkillMapper, times(1)).selectList();
    }
}
