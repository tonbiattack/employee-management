package com.employee.managementapi.security;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

	/**
	 * Spring Securityで使用する
	 * 
	 * @param email メールアドレス
	 * @return アカウント
	 */
	Account selectByEmail(String email);

}
