package com.employee.managementapi.infrastructure.employee;

import java.util.Date;

public class Reinstatement {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.reinstatement.reinstatement_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer reinstatementId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.reinstatement.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.reinstatement.reinstatement_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Date reinstatementDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.reinstatement.reinstatement_id
	 * @return  the value of employee.reinstatement.reinstatement_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getReinstatementId() {
		return reinstatementId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.reinstatement.reinstatement_id
	 * @param reinstatementId  the value for employee.reinstatement.reinstatement_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setReinstatementId(Integer reinstatementId) {
		this.reinstatementId = reinstatementId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.reinstatement.employee_id
	 * @return  the value of employee.reinstatement.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.reinstatement.employee_id
	 * @param employeeId  the value for employee.reinstatement.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.reinstatement.reinstatement_date
	 * @return  the value of employee.reinstatement.reinstatement_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Date getReinstatementDate() {
		return reinstatementDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.reinstatement.reinstatement_date
	 * @param reinstatementDate  the value for employee.reinstatement.reinstatement_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setReinstatementDate(Date reinstatementDate) {
		this.reinstatementDate = reinstatementDate;
	}
}