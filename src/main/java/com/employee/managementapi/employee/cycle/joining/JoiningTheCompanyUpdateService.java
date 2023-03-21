package com.employee.managementapi.employee.cycle.joining;

/**
 * 入社登録サービス
 */
public interface JoiningTheCompanyUpdateService {
	/**
	 * 入社登録(一件)
	 * 
	 * @param joiningTheCompany 入社
	 * @return 追加した入社情報
	 */
	JoiningTheCompanyWithPrimaryKey insert(final JoiningTheCompany domainJoiningTheCompany);
}
