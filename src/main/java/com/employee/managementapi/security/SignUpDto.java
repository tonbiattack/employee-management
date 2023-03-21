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
 * サインアップDTO
 */
@AllArgsConstructor
@Getter
@NoArgsConstructor
@ApiModel(description = "サインアップ")
public class SignUpDto {

	@Email
	@ApiModelProperty(value = "メールアドレス", example = "sano222@example.org")
	@NotBlank
	@Size(max = 256)
	private String companyEmail;

	@ApiModelProperty(value = "パスワード", example = "admin")
	@NotBlank
	private String password;

	@ApiModelProperty(value = "ロールネーム", example = "ADMIN")
	@Size(max = 50)
	@NotBlank
	private String roleName;

	public CompanyEmail toCompanyEmail() {
		return CompanyEmail.builder()
				.companyEmail(companyEmail)
				.build();
	}

	public RoleName toRoleName() {
		return RoleName.builder()
				.roleName(roleName)
				.build();
	}
}
