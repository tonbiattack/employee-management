package com.employee.managementapi.company;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 会社主キー付き
 */
@Getter
@Builder
@AllArgsConstructor
@ApiModel(description = "会社主キー付き")
public class CompanyWithPrimaryKey {
	@ApiModelProperty(value = "会社ID", example = "1")
	@NotNull
	private final int companyId;

	@ApiModelProperty(value = "会社コード", example = "infra001")
	@Size(max = 20)
	@NotBlank
	private final String companyCode;

	@ApiModelProperty(value = "会社名", example = "メディアネットワーク株式会社")
	@NotBlank
	@Size(max = 50)
	private final String companyName;

	@ApiModelProperty(value = "会社事業内容", example = "インフラの運用保守")
	@NotBlank
	private final String companyBusinessContent;
}
