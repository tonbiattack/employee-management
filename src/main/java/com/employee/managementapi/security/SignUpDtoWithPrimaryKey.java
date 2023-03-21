package com.employee.managementapi.security;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * サインアップDTO主キー付き
 *
 */
@AllArgsConstructor
@Getter
public class SignUpDtoWithPrimaryKey {
	@ApiModelProperty(value = "所有権限ID", example = "1")
	@NotNull
	private int ownershipId;

	@NotNull
	@ApiModelProperty(value = "パスワードID", example = "1")
	private int passwordId;

	@Email
	@Size(max = 256)
	@ApiModelProperty(value = "会社メールアドレス", example = "sano222@example.org")
	private String companyEmail;

	@NotBlank
	@ApiModelProperty(value = "パスワード", example = "admin")
	private String password;
	
	@NotBlank
	@ApiModelProperty(value = "ロールネーム", example = "ADMIN")
	private String roleName;
}
