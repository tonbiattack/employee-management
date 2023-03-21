package com.employee.managementapi.employee.cycle.joining;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 入社
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "入社情報")
public class JoiningTheCompany {
	@NotNull
	@ApiModelProperty(value = "社員ID", example = "1")
	private int employeeId;

	@NotNull
	@ApiModelProperty(value = "入社日時", example = "2023/3/15")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date joiningTheCompanyDate;

	/**
	 * 入社を入社主キー付きに変換する。
	 * 
	 * @param joiningTheCompanyId
	 * @return
	 */
	public JoiningTheCompanyWithPrimaryKey toDomainJoiningTheCompanyWithPrimaryKey(int joiningTheCompanyId) {
		return JoiningTheCompanyWithPrimaryKey.builder()
				.joiningTheCompanyId(joiningTheCompanyId)
				.employeeId(employeeId)
				.joiningTheCompanyDate(joiningTheCompanyDate)
				.build();
	}
}
