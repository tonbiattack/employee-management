package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeInfrastructureSkillMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(EmployeeInfrastructureSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(EmployeeInfrastructureSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer employeeInfrastructureSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(EmployeeInfrastructureSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(EmployeeInfrastructureSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<EmployeeInfrastructureSkill> selectByExample(EmployeeInfrastructureSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	EmployeeInfrastructureSkill selectByPrimaryKey(Integer employeeInfrastructureSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") EmployeeInfrastructureSkill row,
			@Param("example") EmployeeInfrastructureSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") EmployeeInfrastructureSkill row,
			@Param("example") EmployeeInfrastructureSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(EmployeeInfrastructureSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_infrastructure_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(EmployeeInfrastructureSkill row);
}