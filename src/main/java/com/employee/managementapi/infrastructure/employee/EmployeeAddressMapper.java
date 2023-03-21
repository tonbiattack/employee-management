package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeAddressMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(EmployeeAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(EmployeeAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer employeeAddressId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(EmployeeAddress row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(EmployeeAddress row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<EmployeeAddress> selectByExample(EmployeeAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	EmployeeAddress selectByPrimaryKey(Integer employeeAddressId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") EmployeeAddress row, @Param("example") EmployeeAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") EmployeeAddress row, @Param("example") EmployeeAddressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(EmployeeAddress row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.employee_address
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(EmployeeAddress row);
}