package com.employee.managementapi.infrastructure.employee;

public class BelongingDepartment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.belonging_department.belonging_department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer belongingDepartmentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.belonging_department.department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer departmentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.belonging_department.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.belonging_department.belonging_department_id
	 * @return  the value of employee.belonging_department.belonging_department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getBelongingDepartmentId() {
		return belongingDepartmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.belonging_department.belonging_department_id
	 * @param belongingDepartmentId  the value for employee.belonging_department.belonging_department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setBelongingDepartmentId(Integer belongingDepartmentId) {
		this.belongingDepartmentId = belongingDepartmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.belonging_department.department_id
	 * @return  the value of employee.belonging_department.department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.belonging_department.department_id
	 * @param departmentId  the value for employee.belonging_department.department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.belonging_department.employee_id
	 * @return  the value of employee.belonging_department.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.belonging_department.employee_id
	 * @param employeeId  the value for employee.belonging_department.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}