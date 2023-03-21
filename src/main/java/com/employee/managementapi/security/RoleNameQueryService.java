package com.employee.managementapi.security;

/**
 * ロールネーム参照サービス
 */
public interface RoleNameQueryService {
	/**
	 * ロール名が登録されているのかどうか確認する。
	 * 
	 * @param checkRole ロールが登録されているのか確認したいロール
	 * @return true 既に登録されているロールがある false 既に登録されているロールが存在しない
	 */
	boolean checkExistsRole(final RoleName roleName);

	/**
	 * ロールネームのIDを取得する。
	 * 
	 * @param roleName ロールネーム
	 * @return ロールID
	 */
	int getRoleId(final RoleName roleName);

}
