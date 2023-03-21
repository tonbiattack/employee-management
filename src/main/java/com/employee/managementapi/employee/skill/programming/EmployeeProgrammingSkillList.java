package com.employee.managementapi.employee.skill.programming;

import java.util.List;

import lombok.Getter;

@Getter
public class EmployeeProgrammingSkillList {
    private final List<EmployeeProgrammingSkill> employeeProgrammingSkills;

    EmployeeProgrammingSkillList(final List<EmployeeProgrammingSkill> employeeProgrammingSkills) {
        this.employeeProgrammingSkills = employeeProgrammingSkills;
    }

    public int size() {
        return employeeProgrammingSkills.size();
    }
}
