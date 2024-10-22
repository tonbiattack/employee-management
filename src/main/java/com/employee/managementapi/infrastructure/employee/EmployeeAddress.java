package com.employee.managementapi.infrastructure.employee;

public class EmployeeAddress {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_address.employee_address_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeAddressId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_address.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_address.post_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String postCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_address.address
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String address;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_address.employee_address_id
	 * @return  the value of employee.employee_address.employee_address_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeAddressId() {
		return employeeAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_address.employee_address_id
	 * @param employeeAddressId  the value for employee.employee_address.employee_address_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeAddressId(Integer employeeAddressId) {
		this.employeeAddressId = employeeAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_address.employee_id
	 * @return  the value of employee.employee_address.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_address.employee_id
	 * @param employeeId  the value for employee.employee_address.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_address.post_code
	 * @return  the value of employee.employee_address.post_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_address.post_code
	 * @param postCode  the value for employee.employee_address.post_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode == null ? null : postCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_address.address
	 * @return  the value of employee.employee_address.address
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_address.address
	 * @param address  the value for employee.employee_address.address
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
}