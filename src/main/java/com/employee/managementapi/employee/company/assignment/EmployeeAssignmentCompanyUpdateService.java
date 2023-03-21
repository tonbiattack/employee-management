package com.employee.managementapi.employee.company.assignment;

/**
 * 社員会社配属登録サービス
 */
public interface EmployeeAssignmentCompanyUpdateService {
    /**
     * 社員を会社に配属する
     * 
     * @param employeeAssignmentCompany 社員配属会社
     * @return 登録した情報
     */
    EmployeeAssignmentCompanyWithPrimaryKey insert(final EmployeeAssignmentCompany employeeAssignmentCompany);

    /**
     * 社員を配属した事実を削除する。
     * この機能は誤って社員を会社に配属するように登録してしまったときの削除処理のみに使う。
     * 社員を配属さした事実は消してはいけないので、社員が離任した時なのでは当該メソッドは使わないようにする。
     * 
     * @param companyAssignmentId 削除したい会社配属ID
     * @return 削除されたかどうか falseが帰ってきた場合は削除対象のリソースがなかったことを示す。
     * 
     */
    boolean delete(final int companyAssignmentId);
}
