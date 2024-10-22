package com.employee.managementapi.infrastructure.employee;

import lombok.Builder;

@Builder
public class EmployeeProgrammingSkill {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column
	 * employee.employee_programming_skill.employee_programming_skill_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeProgrammingSkillId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.employee_programming_skill.programming_skill_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer programmingSkillId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.employee_programming_skill.skill_level
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer skillLevel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.employee_programming_skill.employee_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column
	 * employee.employee_programming_skill.employee_programming_skill_id
	 * 
	 * @return the value of
	 *         employee.employee_programming_skill.employee_programming_skill_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeProgrammingSkillId() {
		return employeeProgrammingSkillId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column
	 * employee.employee_programming_skill.employee_programming_skill_id
	 * 
	 * @param employeeProgrammingSkillId the value for
	 *                                   employee.employee_programming_skill.employee_programming_skill_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeProgrammingSkillId(Integer employeeProgrammingSkillId) {
		this.employeeProgrammingSkillId = employeeProgrammingSkillId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column
	 * employee.employee_programming_skill.programming_skill_id
	 * 
	 * @return the value of employee.employee_programming_skill.programming_skill_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getProgrammingSkillId() {
		return programmingSkillId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.employee_programming_skill.programming_skill_id
	 * 
	 * @param programmingSkillId the value for
	 *                           employee.employee_programming_skill.programming_skill_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setProgrammingSkillId(Integer programmingSkillId) {
		this.programmingSkillId = programmingSkillId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.employee_programming_skill.skill_level
	 * 
	 * @return the value of employee.employee_programming_skill.skill_level
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getSkillLevel() {
		return skillLevel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.employee_programming_skill.skill_level
	 * 
	 * @param skillLevel the value for
	 *                   employee.employee_programming_skill.skill_level
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.employee_programming_skill.employee_id
	 * 
	 * @return the value of employee.employee_programming_skill.employee_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.employee_programming_skill.employee_id
	 * 
	 * @param employeeId the value for
	 *                   employee.employee_programming_skill.employee_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}