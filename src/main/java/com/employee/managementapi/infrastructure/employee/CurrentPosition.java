package com.employee.managementapi.infrastructure.employee;

public class CurrentPosition {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.current_position.current_position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer currentPositionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.current_position.position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer positionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.current_position.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.current_position.current_position_id
	 * @return  the value of employee.current_position.current_position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getCurrentPositionId() {
		return currentPositionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.current_position.current_position_id
	 * @param currentPositionId  the value for employee.current_position.current_position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setCurrentPositionId(Integer currentPositionId) {
		this.currentPositionId = currentPositionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.current_position.position_id
	 * @return  the value of employee.current_position.position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getPositionId() {
		return positionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.current_position.position_id
	 * @param positionId  the value for employee.current_position.position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.current_position.employee_id
	 * @return  the value of employee.current_position.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.current_position.employee_id
	 * @param employeeId  the value for employee.current_position.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}