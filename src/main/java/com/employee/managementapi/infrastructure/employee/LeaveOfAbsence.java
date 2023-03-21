package com.employee.managementapi.infrastructure.employee;

import java.util.Date;

public class LeaveOfAbsence {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.leave_of_absence.leave_of_absence_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer leaveOfAbsenceId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.leave_of_absence.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.leave_of_absence.leave_of_absence_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Date leaveOfAbsenceDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.leave_of_absence.leave_of_absence_id
	 * @return  the value of employee.leave_of_absence.leave_of_absence_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getLeaveOfAbsenceId() {
		return leaveOfAbsenceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.leave_of_absence.leave_of_absence_id
	 * @param leaveOfAbsenceId  the value for employee.leave_of_absence.leave_of_absence_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setLeaveOfAbsenceId(Integer leaveOfAbsenceId) {
		this.leaveOfAbsenceId = leaveOfAbsenceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.leave_of_absence.employee_id
	 * @return  the value of employee.leave_of_absence.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.leave_of_absence.employee_id
	 * @param employeeId  the value for employee.leave_of_absence.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.leave_of_absence.leave_of_absence_date
	 * @return  the value of employee.leave_of_absence.leave_of_absence_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Date getLeaveOfAbsenceDate() {
		return leaveOfAbsenceDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.leave_of_absence.leave_of_absence_date
	 * @param leaveOfAbsenceDate  the value for employee.leave_of_absence.leave_of_absence_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setLeaveOfAbsenceDate(Date leaveOfAbsenceDate) {
		this.leaveOfAbsenceDate = leaveOfAbsenceDate;
	}
}