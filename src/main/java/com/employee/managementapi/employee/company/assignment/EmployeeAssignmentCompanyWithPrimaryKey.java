package com.employee.managementapi.employee.company.assignment;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.employee.managementapi.infrastructure.employee.CompanyAssignment;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 主キー付き社員配属会社
 */
@Getter
@AllArgsConstructor
@Builder
@ApiModel(description = "社員配属会社主キー付き")
public class EmployeeAssignmentCompanyWithPrimaryKey {
	@NotNull
	@ApiModelProperty(value = "会社配属ID", example = "1")
	private int companyAssignmentId;

	@NotNull
	@ApiModelProperty(value = "会社ID", example = "1")
	private int companyId;

	@NotNull
	@ApiModelProperty(value = "社員ID", example = "1")
	private int employeeId;

	@NotNull
	@ApiModelProperty(value = "会社配属日時", example = "2023/3/15")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date companyAssignmentDate;

	/**
	 * ドメインオブジェクトからDBエンティティを生成
	 * 
	 * @return DBエンティティ
	 */
	public CompanyAssignment toCompanyAssignment() {
		return CompanyAssignment.builder()
				.companyAssignmentId(companyAssignmentId)
				.companyId(companyId)
				.employeeId(employeeId)
				.companyAssignmentDate(companyAssignmentDate)
				.build();

	}
}
