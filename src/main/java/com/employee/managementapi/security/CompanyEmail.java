package com.employee.managementapi.security;

import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 会社メールアドレス 
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class CompanyEmail {
	@Email
	private String companyEmail;
}
