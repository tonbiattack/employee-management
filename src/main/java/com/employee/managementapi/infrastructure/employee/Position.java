package com.employee.managementapi.infrastructure.employee;

public class Position {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.position.position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer positionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.position.position_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String positionCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.position.position_name
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String positionName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.position.position_id
	 * @return  the value of employee.position.position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getPositionId() {
		return positionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.position.position_id
	 * @param positionId  the value for employee.position.position_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.position.position_code
	 * @return  the value of employee.position.position_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getPositionCode() {
		return positionCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.position.position_code
	 * @param positionCode  the value for employee.position.position_code
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode == null ? null : positionCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.position.position_name
	 * @return  the value of employee.position.position_name
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.position.position_name
	 * @param positionName  the value for employee.position.position_name
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName == null ? null : positionName.trim();
	}
}