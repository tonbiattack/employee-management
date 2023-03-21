package com.employee.managementapi.employee.skill.framework;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeFrameworkSkillMapper {
    List<EmployeeFrameworkSkill> selectList();
}
