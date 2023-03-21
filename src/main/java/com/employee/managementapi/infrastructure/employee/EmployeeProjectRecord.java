package com.employee.managementapi.infrastructure.employee;

import java.util.Date;

public class EmployeeProjectRecord {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_project_record.employee_project_record_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeProjectRecordId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_project_record.project_leaving_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Date projectLeavingDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_project_record.evaluation_point
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String evaluationPoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_project_record.reflection_point
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private String reflectionPoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_project_record.project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer projectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.employee_project_record.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_project_record.employee_project_record_id
	 * @return  the value of employee.employee_project_record.employee_project_record_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeProjectRecordId() {
		return employeeProjectRecordId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_project_record.employee_project_record_id
	 * @param employeeProjectRecordId  the value for employee.employee_project_record.employee_project_record_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeProjectRecordId(Integer employeeProjectRecordId) {
		this.employeeProjectRecordId = employeeProjectRecordId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_project_record.project_leaving_date
	 * @return  the value of employee.employee_project_record.project_leaving_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Date getProjectLeavingDate() {
		return projectLeavingDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_project_record.project_leaving_date
	 * @param projectLeavingDate  the value for employee.employee_project_record.project_leaving_date
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setProjectLeavingDate(Date projectLeavingDate) {
		this.projectLeavingDate = projectLeavingDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_project_record.evaluation_point
	 * @return  the value of employee.employee_project_record.evaluation_point
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getEvaluationPoint() {
		return evaluationPoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_project_record.evaluation_point
	 * @param evaluationPoint  the value for employee.employee_project_record.evaluation_point
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEvaluationPoint(String evaluationPoint) {
		this.evaluationPoint = evaluationPoint == null ? null : evaluationPoint.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_project_record.reflection_point
	 * @return  the value of employee.employee_project_record.reflection_point
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getReflectionPoint() {
		return reflectionPoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_project_record.reflection_point
	 * @param reflectionPoint  the value for employee.employee_project_record.reflection_point
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setReflectionPoint(String reflectionPoint) {
		this.reflectionPoint = reflectionPoint == null ? null : reflectionPoint.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_project_record.project_id
	 * @return  the value of employee.employee_project_record.project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_project_record.project_id
	 * @param projectId  the value for employee.employee_project_record.project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.employee_project_record.employee_id
	 * @return  the value of employee.employee_project_record.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.employee_project_record.employee_id
	 * @param employeeId  the value for employee.employee_project_record.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}