package com.employee.managementapi.employee.skill.programming;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeProgrammingSkillMapper {
    List<EmployeeProgrammingSkill> selectList();

}
