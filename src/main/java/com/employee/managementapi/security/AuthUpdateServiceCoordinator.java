package com.employee.managementapi.security;

/**
 *認証更新サービス
 */
public interface AuthUpdateServiceCoordinator {
	/**
	 * ユーザーアカウントを登録する
	 * 
	 * @param signUpDto サインアップDTO
	 * @return 登録したデータの各主キー付きサインアップDTO
	 */
	SignUpDtoWithPrimaryKey registerUser(SignUpDto signUpDto);
}