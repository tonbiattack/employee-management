package com.employee.managementapi.employee.company.belonging;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 社員所属会社
 */
@Getter
@Builder
@AllArgsConstructor
@ApiModel(description = "社員所属会社")
public class EmployeeBelongingCompany {
	@NotNull
	@ApiModelProperty(value = "会社ID", example = "1")
	private final int companyId;

	@ApiModelProperty(value = "社員ID", example = "1")
	@NotNull
	private final int employeeId;

	/**
	 * 社員所属会社から社員所属会社主キー付きを生成する
	 * 
	 * @param belongingCompanyId 自動採番した主キー
	 * @return 自動採番した主キーを含む社員所属会社クラス
	 */
	public EmployeeBelongingCompanyWithPrimaryKey toDomainBelongingCompanyWithPrimaryKey(int belongingCompanyId) {
		return EmployeeBelongingCompanyWithPrimaryKey.builder()
				.belongingCompanyId(belongingCompanyId)
				.companyId(companyId)
				.employeeId(employeeId)
				.build();
	}
}
