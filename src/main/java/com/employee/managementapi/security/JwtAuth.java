package com.employee.managementapi.security;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * JWT authレスポンス
 */
@Getter
@ApiModel(description = "JWT")
public class JwtAuth {
	@ApiModelProperty(value = "アクセストークン", example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoYXlhbWFtYXNhaGlyb0BleGFtcGxlLmNvLmpwIiwiaWF0IjoxNjc4ODU1MDU5LCJleHAiOjE2Nzg4NjExMDd9.sX4wjKVMUjZvHytsTnsZDBS9WYOSPtQwrJcOZ6KHHfOptGHeG40ASycwanA6BrfwzPqNNkayvfMXDHaA3wZYnQ")
	@NotNull
	private String accessToken;

	@ApiModelProperty(value = "トークンタイプ", example = "Bearer")
	private String tokenType = "Bearer";

	public JwtAuth(String accessToken) {
		this.accessToken = accessToken;
	}
}
