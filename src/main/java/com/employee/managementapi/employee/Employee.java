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
import lombok.NoArgsConstructor;

/**
 * 社員情報
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "社員情報")
public class Employee {

	@ApiModelProperty(value = "性別", example = "2")
	@NotNull
	private int genderId;

	@ApiModelProperty(value = "社員在籍区分ID", example = "1")
	@NotNull
	private int employeeStatusId;

	@ApiModelProperty(value = "社員コード", example = "51001")
	@NotBlank
	@Size(max = 20)
	private String employeeCode;

	@ApiModelProperty(value = "性", example = "林部")
	@NotBlank
	@Size(max = 90)
	private String familyName;

	@ApiModelProperty(value = "名", example = "久美子")
	@NotBlank
	@Size(max = 60)
	private String lastName;

	@ApiModelProperty(value = "性フリガナ", example = "ハヤシベ")
	@NotBlank
	@Size(max = 90)
	private String familyNameFurigana;

	@ApiModelProperty(value = "名フリガナ", example = "クミコ")
	@NotBlank
	@Size(max = 180)
	private String lastNameFurigana;

	@NotNull
	@ApiModelProperty(value = "生年月日", example = "2023/3/15")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date dateOfBirth;

	@ApiModelProperty(value = "性別ID", example = "1")
	@NotNull
	private int grade;

	@ApiModelProperty(value = "コメント", example = "Javaに関しての深い知識を持っており、最新の文法に関しても精通している。")
	@NotBlank
	private String comment;

	/**
	 * DomainEmployeeからDomainEmployeeWithPrimaryKeyを作成する
	 * 
	 * @param employeeId 自動採番した主キー
	 * @return 自動裁判した主キーを含む社員クラス
	 */
	public EmployeeWithPrimaryKey toDomainEmployeeWithPrimaryKey(int employeeId) {
		return EmployeeWithPrimaryKey.builder()
				.employeeId(employeeId)
				.genderId(genderId)
				.employeeStatusId(employeeStatusId)
				.employeeCode(employeeCode)
				.familyName(familyName)
				.lastName(lastName)
				.familyNameFurigana(familyNameFurigana)
				.lastNameFurigana(lastNameFurigana)
				.dateOfBirth(dateOfBirth)
				.grade(grade)
				.comment(comment)
				.build();
	}
}
