package com.employee.managementapi.employee;

/**
 * 社員基本情報取得サービス
 */
public interface EmployeeBasicProfileQueryService {
    /**
     * 社員基本情報を任意の件数から
     * 
     * @param start 取得開始社員番号(現役社員のみ、昇順)
     * @param limit 取得上限社員番号(現役社員のみ、昇順)
     * @return 社員基本情報一覧
     */
    EmployeeBasicProfileList getListByLimit(final int start, final int limit);

    /**
     * 社員基本情報を社員IDで検索する
     * 
     * @param employeeIdList 社員ID一覧
     * @return 社員基本情報一覧
     */
    EmployeeBasicProfileList getListByEmployeeIds(EmployeeIdList employeeIdList);
}
