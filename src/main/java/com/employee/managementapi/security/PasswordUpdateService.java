package com.employee.managementapi.security;

import com.employee.managementapi.infrastructure.employee.Password;

/**
 * パスワード更新サービス
 */
public interface PasswordUpdateService {

	/**
	 * パスワードを登録します
	 * @param password パスワード
	 * @return 登録したパスワード
	 */
	Password register(final Password password);

}
