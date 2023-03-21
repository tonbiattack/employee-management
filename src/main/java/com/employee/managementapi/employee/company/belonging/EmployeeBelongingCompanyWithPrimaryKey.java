package com.employee.managementapi.employee.company.belonging;

import com.employee.managementapi.infrastructure.employee.BelongingCompany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 社員所属会社主キー付き
 */
@Getter
@AllArgsConstructor
@Builder
public class EmployeeBelongingCompanyWithPrimaryKey {
    private int belongingCompanyId;
    private int companyId;
    private int employeeId;

    /**
     * 主キー付きドメインオブジェクトをDBエンティティクラスに変換する
     * 
     * @return DBエンティティ
     */
    public BelongingCompany toBelongingCompany() {
        return BelongingCompany.builder()
                .belongingCompanyId(belongingCompanyId)
                .companyId(companyId)
                .employeeId(employeeId)
                .build();
    }
}
