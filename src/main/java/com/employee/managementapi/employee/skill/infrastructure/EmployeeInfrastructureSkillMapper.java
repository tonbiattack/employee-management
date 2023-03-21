package com.employee.managementapi.employee.skill.infrastructure;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeInfrastructureSkillMapper {
    List<EmployeeInfrastructureSkill> selectList();
}
