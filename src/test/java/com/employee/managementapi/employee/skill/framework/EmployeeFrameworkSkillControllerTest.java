package com.employee.managementapi.employee.skill.framework;

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
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class EmployeeFrameworkSkillControllerTest {

    private MockMvc mvc;

    @Mock
    private EmployeeFrameworkSkillQueryService employeeFrameworkSkillListService;

    @InjectMocks
    private EmployeeFrameworkSkillController employeeFrameworkSkillController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(employeeFrameworkSkillController).build();
    }

    @DisplayName("SELECT TEST: 社員のフレームワークスキルが全て受け取れているのか")
    @Test
    public void testSelectAll() {
        EmployeeFrameworkSkill employeeFrameworkSkill1 = new EmployeeFrameworkSkill(9, 9, "9", "Ruby on Rails", 4);
        EmployeeFrameworkSkill employeeFrameworkSkill2 = new EmployeeFrameworkSkill(9, 6009, "9", "FastAPI", 6);
        List<EmployeeFrameworkSkill> employeeFrameworkSkills = new ArrayList<>();
        employeeFrameworkSkills.add(employeeFrameworkSkill1);
        employeeFrameworkSkills.add(employeeFrameworkSkill2);
        EmployeeFrameworkSkillList employeeFrameworkSkillList = new EmployeeFrameworkSkillList(employeeFrameworkSkills);
        when(employeeFrameworkSkillListService.getList()).thenReturn(employeeFrameworkSkillList);

        EmployeeFrameworkSkillList actuals = employeeFrameworkSkillController.getList();
        assertEquals(2, actuals.size());
        verify(employeeFrameworkSkillListService, times(1)).getList();
    }

    @DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
    @Test
    void testApi() throws Exception {
        // GET http://localhost:8080/api/v1/employees/skills/frameworks
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/employees/skills/frameworks"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }
}
