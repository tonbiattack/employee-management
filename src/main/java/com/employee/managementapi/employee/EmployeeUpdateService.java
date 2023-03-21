package com.employee.managementapi.employee;

/**
 * 社員登録サービス
 */
public interface EmployeeUpdateService {
	/**
	 * 社員を一件登録する
	 * 
	 * @param employee 社員
	 * @return 登録した社員情報
	 */
	EmployeeWithPrimaryKey insert(final Employee employee);
}
