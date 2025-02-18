package com.employee.managementapi.infrastructure.employee;

public class Department {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.department.department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer departmentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.department.company_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.department.department_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String departmentCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.department.department_name
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String departmentName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.department.department_id
	 * @return  the value of employee.department.department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.department.department_id
	 * @param departmentId  the value for employee.department.department_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.department.company_id
	 * @return  the value of employee.department.company_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.department.company_id
	 * @param companyId  the value for employee.department.company_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.department.department_code
	 * @return  the value of employee.department.department_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getDepartmentCode() {
		return departmentCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.department.department_code
	 * @param departmentCode  the value for employee.department.department_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode == null ? null : departmentCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.department.department_name
	 * @return  the value of employee.department.department_name
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.department.department_name
	 * @param departmentName  the value for employee.department.department_name
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName == null ? null : departmentName.trim();
	}
}