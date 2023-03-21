package com.employee.managementapi.security;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleNameMapper {
	/**
	 * ロールIDを取得する。
	 * 
	 * @param roleName ロールネーム
	 * @return ロールID
	 */
	int selectRoleIdByRole(RoleName roleName);

	/**
	 * 検索対象のロールネームが何件存在するのか取得する
	 * 
	 * @param roleName ロールネーム
	 * @return 1件(存在する場合) or 0件(存在しない場合)
	 */
	int countByRole(RoleName roleName);
}
