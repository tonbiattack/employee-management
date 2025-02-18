package com.employee.managementapi.infrastructure.employee;

import java.util.Date;

import com.employee.managementapi.employee.company.assignment.EmployeeAssignmentCompany;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class CompanyAssignment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.company_assignment.company_assignment_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer companyAssignmentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.company_assignment.company_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.company_assignment.employee_id
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Integer employeeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column employee.company_assignment.company_assignment_date
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	private Date companyAssignmentDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.company_assignment.company_assignment_id
	 * 
	 * @return the value of employee.company_assignment.company_assignment_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getCompanyAssignmentId() {
		return companyAssignmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.company_assignment.company_assignment_id
	 * 
	 * @param companyAssignmentId the value for
	 *                            employee.company_assignment.company_assignment_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setCompanyAssignmentId(Integer companyAssignmentId) {
		this.companyAssignmentId = companyAssignmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.company_assignment.company_id
	 * 
	 * @return the value of employee.company_assignment.company_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.company_assignment.company_id
	 * 
	 * @param companyId the value for employee.company_assignment.company_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.company_assignment.employee_id
	 * 
	 * @return the value of employee.company_assignment.employee_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.company_assignment.employee_id
	 * 
	 * @param employeeId the value for employee.company_assignment.employee_id
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column employee.company_assignment.company_assignment_date
	 * 
	 * @return the value of employee.company_assignment.company_assignment_date
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public Date getCompanyAssignmentDate() {
		return companyAssignmentDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column employee.company_assignment.company_assignment_date
	 * 
	 * @param companyAssignmentDate the value for
	 *                              employee.company_assignment.company_assignment_date
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	public void setCompanyAssignmentDate(Date companyAssignmentDate) {
		this.companyAssignmentDate = companyAssignmentDate;
	}

	/**
	 * ドメインオブジェクトからインスタンスを生成
	 * 
	 * @param employeeAssignmentCompany ドメインオブジェクト
	 * @return DBエンティティインスタンス
	 */
	public static CompanyAssignment build(final EmployeeAssignmentCompany employeeAssignmentCompany) {
		return CompanyAssignment.builder()
				.companyId(employeeAssignmentCompany.getCompanyId())
				.employeeId(employeeAssignmentCompany.getCompanyId())
				.companyAssignmentDate(employeeAssignmentCompany.getCompanyAssignmentDate())
				.build();
	}

	/**
	 * DBエンティティをドメインオブジェクトへ変換
	 * 
	 * @return ドメインオブジェクト
	 */
	public EmployeeAssignmentCompany toDomainCompanyAssignment() {
		return EmployeeAssignmentCompany.builder()
				.companyId(this.getCompanyId())
				.employeeId(this.getEmployeeId())
				.companyAssignmentDate(this.getCompanyAssignmentDate())
				.build();
	}

}