package com.employee.managementapi.company;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 会社
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "会社")
public class Company {
	@Size(max = 20)
	@NotBlank
	@ApiModelProperty(value = "会社コード", example = "infra001")
	private String companyCode;

	@Size(max = 50)
	@NotBlank
	@ApiModelProperty(value = "会社名", example = "メディアネットワーク株式会社")
	private String companyName;

	@NotBlank
	@ApiModelProperty(value = "会社事業内容", example = "インフラの運用保守")
	private String companyBusinessContent;

	/**
	 * 会社から会社主キー付きを作成する。
	 * 
	 * @param companyId 自動採番した主キー
	 * @return 自動採番した主キーを含む会社クラス
	 */
	public CompanyWithPrimaryKey toCompanyWithPrimaryKey(int companyId) {
		return CompanyWithPrimaryKey.builder()
				.companyId(companyId)
				.companyCode(companyCode)
				.companyName(companyName)
				.companyBusinessContent(companyBusinessContent)
				.build();
	}
}
