package com.employee.managementapi.aop;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 例外レスポンス
 */
@Data
@AllArgsConstructor
@ApiModel(description = "例外レスポンス")
public class ExceptionResponse {
	@ApiModelProperty(value = "エラー説明", example = "入力されたメールアドレスは既に登録されています。")
	private String errorDescription;
}