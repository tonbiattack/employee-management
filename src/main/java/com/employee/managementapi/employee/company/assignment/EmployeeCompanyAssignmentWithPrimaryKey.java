package com.employee.managementapi.employee.company.assignment;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.employee.managementapi.employee.company.belonging.EmployeeBelongingCompanyWithPrimaryKey;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 
 * 社員会社配属主キー付き
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "社員会社配属主キー付き")
public class EmployeeCompanyAssignmentWithPrimaryKey {

	@ApiModelProperty(value = "会社配属ID", example = "1")
	@NotNull
	private int companyAssignmentId;

	@ApiModelProperty(value = "所属会社ID", example = "1")
	@NotNull
	private int belongingCompanyId;

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
	 * 社員会社配属主キー付きから社員配属会社を作成する。
	 * 複合ドメインオブジェクトを分解する。
	 * このテーブルは更新処理は基本的にしないので、削除、追加処理のみ
	 * 履歴テーブルの役目
	 * 
	 * @return 社員配属会社
	 */
	public EmployeeAssignmentCompany toEmployeeAssignmentCompanyWithPrimaryKey() {
		return EmployeeAssignmentCompany.builder()
				.companyId(companyId)
				.employeeId(employeeId)
				.companyAssignmentDate(companyAssignmentDate)
				.build();
	}

	/**
	 * 社員会社配属主キー付きから社員所属会社主キー付きを作成する。
	 * 複合ドメインオブジェクトを分解する。
	 * 
	 * @return 社員所属会社主キー付き
	 */
	public EmployeeBelongingCompanyWithPrimaryKey toEmployeeBelongingCompanyWithPrimaryKey() {
		return EmployeeBelongingCompanyWithPrimaryKey.builder()
				.belongingCompanyId(belongingCompanyId)
				.companyId(companyId)
				.employeeId(employeeId)
				.build();
	}
}
