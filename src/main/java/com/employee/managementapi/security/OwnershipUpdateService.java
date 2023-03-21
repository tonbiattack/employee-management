package com.employee.managementapi.security;

import com.employee.managementapi.infrastructure.employee.Ownership;

/**
 * 所有権限更新サービス
 */
public interface OwnershipUpdateService {
	/**
	 * 所有権限を登録する
	 * 
	 * @param ownership 所有権限
	 * @return 登録した所有権限
	 */
	Ownership register(final Ownership ownership);

}
