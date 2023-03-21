package com.employee.managementapi.employee.company.assignment;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 社員配属会社
 */
@Getter
@AllArgsConstructor
@Builder
@ApiModel(description = "社員配属会社")
public class EmployeeAssignmentCompany {
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
	 * 社員配属会社から社員配属会社主キー付きを作成する
	 * 
	 * @param companyAssignmentId 自動採番した主キー
	 * @return 自動採番した主キーを含む社員配属会社
	 */
	public EmployeeAssignmentCompanyWithPrimaryKey toEmployeeAssignmentCompanyWithPrimaryKey(int companyAssignmentId) {
		return EmployeeAssignmentCompanyWithPrimaryKey.builder()
				.companyAssignmentId(companyAssignmentId)
				.companyId(companyId)
				.employeeId(employeeId)
				.companyAssignmentDate(companyAssignmentDate)
				.build();
	}
}
