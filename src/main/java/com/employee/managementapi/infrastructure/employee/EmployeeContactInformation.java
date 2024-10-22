package com.employee.managementapi.infrastructure.employee;

public class EmployeeContactInformation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_contact_information.employee_contact_information_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeContactInformationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_contact_information.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_contact_information.private_phone_number
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String privatePhoneNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_contact_information.private_email
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String privateEmail;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_contact_information.employee_contact_information_id
	 * @return  the value of employee.employee_contact_information.employee_contact_information_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeContactInformationId() {
		return employeeContactInformationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_contact_information.employee_contact_information_id
	 * @param employeeContactInformationId  the value for employee.employee_contact_information.employee_contact_information_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeContactInformationId(Integer employeeContactInformationId) {
		this.employeeContactInformationId = employeeContactInformationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_contact_information.employee_id
	 * @return  the value of employee.employee_contact_information.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_contact_information.employee_id
	 * @param employeeId  the value for employee.employee_contact_information.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_contact_information.private_phone_number
	 * @return  the value of employee.employee_contact_information.private_phone_number
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getPrivatePhoneNumber() {
		return privatePhoneNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_contact_information.private_phone_number
	 * @param privatePhoneNumber  the value for employee.employee_contact_information.private_phone_number
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPrivatePhoneNumber(String privatePhoneNumber) {
		this.privatePhoneNumber = privatePhoneNumber == null ? null : privatePhoneNumber.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_contact_information.private_email
	 * @return  the value of employee.employee_contact_information.private_email
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getPrivateEmail() {
		return privateEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_contact_information.private_email
	 * @param privateEmail  the value for employee.employee_contact_information.private_email
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPrivateEmail(String privateEmail) {
		this.privateEmail = privateEmail == null ? null : privateEmail.trim();
	}
}