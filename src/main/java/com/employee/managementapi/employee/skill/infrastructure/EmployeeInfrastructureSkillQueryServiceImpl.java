package com.employee.managementapi.employee.skill.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeInfrastructureSkillQueryServiceImpl implements EmployeeInfrastructureSkillQueryService {

    @Autowired
    private final EmployeeInfrastructureSkillMapper employeeInfrastructureSkillMapper;

    @Override
    public EmployeeInfrastructureSkillList getList() {
        final List<EmployeeInfrastructureSkill> employeeInfrastructureSkills = employeeInfrastructureSkillMapper
                .selectList();
        return new EmployeeInfrastructureSkillList(employeeInfrastructureSkills);
    }
}
