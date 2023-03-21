package com.employee.managementapi.employee.skill.programming;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeProgrammingSkillQueryServiceImpl implements EmployeeProgrammingSkillQueryService {

    @Autowired
    private final EmployeeProgrammingSkillMapper employeeProgrammingSkillMapper;

    @Override
    public EmployeeProgrammingSkillList getList() {
        List<EmployeeProgrammingSkill> employeeProgrammingSkills = employeeProgrammingSkillMapper.selectList();
        return new EmployeeProgrammingSkillList(employeeProgrammingSkills);
    }
}
