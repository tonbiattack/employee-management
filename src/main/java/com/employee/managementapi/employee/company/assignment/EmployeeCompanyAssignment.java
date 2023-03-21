package com.employee.managementapi.employee.company.assignment;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.employee.managementapi.employee.company.belonging.EmployeeBelongingCompany;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 社員会社配属
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "社員会社配属")
public class EmployeeCompanyAssignment {
	@ApiModelProperty(value = "会社ID", example = "1")
	@NotNull
	private int companyId;

	@ApiModelProperty(value = "社員ID", example = "1")
	@NotNull
	private int employeeId;

	@ApiModelProperty(value = "会社配属日時", example = "2023/3/15")
	@NotNull
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date companyAssignmentDate;

	/**
	 * 社員会社配属から社員会社配属主キー付きを作成する。
	 * 
	 * @param belongingCompanyId
	 * @return 主キーを含む社員会社配属
	 */
	public EmployeeCompanyAssignmentWithPrimaryKey toEmployeeCompanyAssignmentWithPrimaryKey(int belongingCompanyId) {
		return EmployeeCompanyAssignmentWithPrimaryKey.builder().belongingCompanyId(belongingCompanyId)
				.companyId(companyId)
				.employeeId(employeeId).companyAssignmentDate(companyAssignmentDate)
				.build();
	}

	/**
	 * 社員会社配属から社員配属会社を作成する。
	 * 複合ドメインオブジェクトを分解する。
	 * 
	 * @return 社員配属会社
	 */
	public EmployeeAssignmentCompany toEmployeeAssignmentCompany() {
		return EmployeeAssignmentCompany.builder()
				.companyId(companyId)
				.employeeId(employeeId)
				.companyAssignmentDate(companyAssignmentDate)
				.build();
	}

	/**
	 * 社員会社配属から社員所属会社を作成する。
	 * 複合ドメインオブジェクトを分解する。
	 * 
	 * @return 社員所属会社
	 */
	public EmployeeBelongingCompany toEmployeeBelongingCompany() {
		return EmployeeBelongingCompany.builder()
				.companyId(companyId)
				.employeeId(employeeId)
				.build();
	}
}
