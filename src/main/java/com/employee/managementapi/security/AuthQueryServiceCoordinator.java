package com.employee.managementapi.security;

/**
 *認証参照サービス
 */
public interface AuthQueryServiceCoordinator {
	JwtAuth authenticateUser(SignInDto signInDto);
}