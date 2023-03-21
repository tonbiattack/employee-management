package com.employee.managementapi.employee.company.assignment;

/**
 * 社員会社配属登録サービス
 */
public interface EmployeeCompanyAssignmentUpdateServiceCoordinator {
        /**
         * 社員を会社に初配属します。
         * 
         * @param companyAssignment 会社配属
         * @return 配属させた会社
         */
        EmployeeCompanyAssignmentWithPrimaryKey assignment(EmployeeCompanyAssignment companyAssignment);

        /**
         * 社員を出向させます。
         * 
         * @param companyAssignment 会社配属
         * @return 出向した会社
         */
        EmployeeCompanyAssignmentWithPrimaryKey jobAssignmentSystem(
                        EmployeeCompanyAssignmentWithPrimaryKey companyAssignmentWithPrimaryKey);

        /**
         * 社員が会社に配属された事実を削除します。
         * この機能は誤って社員を会社に所属するように登録してしまったときの削除処理に使います。
         * 
         * @param companyAssignmentId 会社配属ID
         * @param belongingCompanyId  所属会社ID
         * 
         */
        void delete(
                        int companyAssignmentId, int belongingCompanyId);
}
