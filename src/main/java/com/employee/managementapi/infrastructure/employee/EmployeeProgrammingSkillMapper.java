package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeProgrammingSkillMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(EmployeeProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(EmployeeProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer employeeProgrammingSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(EmployeeProgrammingSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(EmployeeProgrammingSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<EmployeeProgrammingSkill> selectByExample(EmployeeProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	EmployeeProgrammingSkill selectByPrimaryKey(Integer employeeProgrammingSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") EmployeeProgrammingSkill row,
			@Param("example") EmployeeProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") EmployeeProgrammingSkill row,
			@Param("example") EmployeeProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(EmployeeProgrammingSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(EmployeeProgrammingSkill row);

}