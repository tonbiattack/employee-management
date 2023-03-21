package com.employee.managementapi.infrastructure.employee;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeFrameworkSkillMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(EmployeeFrameworkSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(EmployeeFrameworkSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer employeeFrameworkSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(EmployeeFrameworkSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(EmployeeFrameworkSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<EmployeeFrameworkSkill> selectByExample(EmployeeFrameworkSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	EmployeeFrameworkSkill selectByPrimaryKey(Integer employeeFrameworkSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") EmployeeFrameworkSkill row,
			@Param("example") EmployeeFrameworkSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") EmployeeFrameworkSkill row,
			@Param("example") EmployeeFrameworkSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(EmployeeFrameworkSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_framework_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(EmployeeFrameworkSkill row);
}