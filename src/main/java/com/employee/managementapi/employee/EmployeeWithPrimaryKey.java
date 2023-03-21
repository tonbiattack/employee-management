package com.employee.managementapi.employee;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 社員主キー付き
 */
@Getter
@Builder
@AllArgsConstructor
@ApiModel(description = "社員情報主キー付き")
public class EmployeeWithPrimaryKey {

	@ApiModelProperty(value = "社員ID", example = "1")
	@NotNull
	private final int employeeId;

	@ApiModelProperty(value = "性別ID", example = "1")
	@NotNull
	private final int genderId;

	@ApiModelProperty(value = "社員在籍区分ID", example = "1")
	@NotNull
	private final int employeeStatusId;

	@ApiModelProperty(value = "社員コード", example = "51001")
	@NotBlank
	@Size(max = 20)
	private final String employeeCode;

	@ApiModelProperty(value = "性", example = "林部")
	@NotBlank
	@Size(max = 90)
	private final String familyName;

	@ApiModelProperty(value = "名", example = "久美子")
	@NotBlank
	@Size(max = 60)
	private final String lastName;

	@ApiModelProperty(value = "性フリガナ", example = "ハヤシベ")
	@NotBlank
	@Size(max = 90)
	private final String familyNameFurigana;
    
	@ApiModelProperty(value = "名フリガナ", example = "クミコ")
	@NotBlank
	@Size(max = 180)
	private final String lastNameFurigana;

	@NotNull
	@ApiModelProperty(value = "生年月日", example = "2023/3/15")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private final Date dateOfBirth;

	@ApiModelProperty(value = "性別ID", example = "1")
	@NotNull
	private final int grade;

	@ApiModelProperty(value = "コメント", example = "Javaに関しての深い知識を持っており、最新の文法に関しても精通している。")
	@NotBlank
	private final String comment;
}
