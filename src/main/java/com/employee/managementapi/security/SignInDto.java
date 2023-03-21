package com.employee.managementapi.security;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * サインインDTO
 */
@AllArgsConstructor
@Getter
@NoArgsConstructor
@ApiModel(description = "サインイン")
public class SignInDto {
	@Email
	@ApiModelProperty(value = "メールアドレス", example = "hayamamasahiro@example.co.jp")
	@Size(max = 256)
	@NotBlank
	private String email;

	@ApiModelProperty(value = "パスワード", example = "admin")
	@NotBlank
	private String password;
}
