package com.employee.managementapi.company;

/**
 * 会社登録サービス
 */
public interface CompanyUpdateService {
    /**
     * 会社を一社登録する
     * 
     * @param company 会社
     * @return 登録した会社
     */
    CompanyWithPrimaryKey insert(final Company company);
}
