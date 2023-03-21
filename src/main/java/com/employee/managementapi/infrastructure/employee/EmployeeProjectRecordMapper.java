package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeProjectRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(EmployeeProjectRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(EmployeeProjectRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer employeeProjectRecordId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(EmployeeProjectRecord row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(EmployeeProjectRecord row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<EmployeeProjectRecord> selectByExample(EmployeeProjectRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	EmployeeProjectRecord selectByPrimaryKey(Integer employeeProjectRecordId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") EmployeeProjectRecord row,
			@Param("example") EmployeeProjectRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") EmployeeProjectRecord row,
			@Param("example") EmployeeProjectRecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(EmployeeProjectRecord row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_project_record
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(EmployeeProjectRecord row);
}