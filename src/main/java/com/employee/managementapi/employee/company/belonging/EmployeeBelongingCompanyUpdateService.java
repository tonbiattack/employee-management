package com.employee.managementapi.employee.company.belonging;

/**
 * 所属会社登録サービス
 */
public interface EmployeeBelongingCompanyUpdateService {
    /**
     * 社員を会社に所属させる。
     * 
     * @param domainBelongingCompany 所属会社
     * @return 所属するようになった会社
     */
    EmployeeBelongingCompanyWithPrimaryKey insert(final EmployeeBelongingCompany domainBelongingCompany);

    /**
     * 社員が所属している会社を更新する。
     * 
     * @param domainBelongingCompany 所属会社
     * @return 新しく所属するようになった会社
     */
    EmployeeBelongingCompanyWithPrimaryKey update(
            final EmployeeBelongingCompanyWithPrimaryKey domainBelongingCompanywWithPrimaryKey);

    /**
     * 社員が所属している会社を削除する。
     * この機能は誤って社員を会社に所属するように登録してしまったときの削除処理のみに使う。
     * 
     * 
     * @param belongingCompanyId 削除したい所属会社ID
     * @return 削除されたかどうか falseが帰ってきた場合は削除対象のリソースがなかったことを示す。 
     */
    boolean delete(
            final int belongingCompanyId);
}
