package com.employee.managementapi.security;

import java.util.List;

import javax.validation.constraints.Email;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *Spring Securityで使用するクラス
 */
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@ApiModel(description = "アカウント")
public class Account {
	@Email
	private String companyEmail;
	private String password;
	List<RoleName> roleNameList;
}
