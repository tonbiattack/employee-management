package com.employee.managementapi.security;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

/**
 * ロールネーム
 */
@Getter
@Builder
public class RoleName {
	private static final String ROLE_PREFIX = "ROLE_";

	@Size(max = 50)
	@ApiModelProperty(value = "ロールネーム", example = "ADMIN")
	@NotBlank
	private String roleName;

	public RoleName(String roleName) {
		String roleNameAndPrefix = ROLE_PREFIX + roleName;
		this.roleName = roleNameAndPrefix;
	}
}
