package com.employee.managementapi.infrastructure.employee;

public class BelongingProject {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.belonging_project.belonging_project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer belongingProjectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.belonging_project.project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer projectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column employee.belonging_project.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.belonging_project.belonging_project_id
	 * @return  the value of employee.belonging_project.belonging_project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getBelongingProjectId() {
		return belongingProjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.belonging_project.belonging_project_id
	 * @param belongingProjectId  the value for employee.belonging_project.belonging_project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setBelongingProjectId(Integer belongingProjectId) {
		this.belongingProjectId = belongingProjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.belonging_project.project_id
	 * @return  the value of employee.belonging_project.project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.belonging_project.project_id
	 * @param projectId  the value for employee.belonging_project.project_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column employee.belonging_project.employee_id
	 * @return  the value of employee.belonging_project.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column employee.belonging_project.employee_id
	 * @param employeeId  the value for employee.belonging_project.employee_id
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}