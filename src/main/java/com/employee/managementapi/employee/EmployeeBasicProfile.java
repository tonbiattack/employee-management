package com.employee.managementapi.employee;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社員基本情報
 */
@AllArgsConstructor
@Getter
@ApiModel(description = "社員基本情報")
public class EmployeeBasicProfile {
	@ApiModelProperty(value = "社員ID", example = "1")
	@NotNull
	private final int employeeId;

	@ApiModelProperty(value = "社員コード", example = "56001")
	@NotBlank
	@Size(max = 20)
	private final String employeeCode;

	@ApiModelProperty(value = "性", example = "田嶋")
	@NotBlank
	@Size(max = 90)
	private final String familyName;

	@ApiModelProperty(value = "名", example = "研人")
	@NotBlank
	@Size(max = 60)
	private final String lastName;

	@ApiModelProperty(value = "性フリガナ", example = "タジマ")
	@NotBlank
	@Size(max = 90)
	private final String familyNameFurigana;

	@ApiModelProperty(value = "名フリガナ", example = "ケント")
	@NotBlank
	@Size(max = 180)
	private final String lastNameFurigana;
}