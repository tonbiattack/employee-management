package com.employee.managementapi.employee.company.assignment;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.CompanyAssignment;
import com.employee.managementapi.infrastructure.employee.CompanyAssignmentMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeAssignmentCompanyUpdateServiceImpl implements EmployeeAssignmentCompanyUpdateService {

    private final CompanyAssignmentMapper companyAssignmentMapper;

    @Override
    public EmployeeAssignmentCompanyWithPrimaryKey insert(EmployeeAssignmentCompany employeeAssignmentCompany) {
        CompanyAssignment companyAssignment = CompanyAssignment.build(employeeAssignmentCompany);
        int companyAssignmentId = companyAssignmentMapper.selectNextval();
        companyAssignment.setCompanyAssignmentId(companyAssignmentId);
        companyAssignmentMapper.insert(companyAssignment);
        return employeeAssignmentCompany.toEmployeeAssignmentCompanyWithPrimaryKey(companyAssignmentId);
    }

    @Override
    public boolean delete(int companyAssignmentId) {
        // 本来は削除されたリソースがあるのかどうかboolean型で返したいが、MyBatis
        // Generatorで自動生成されたファイルを使うことで変更に強くしたいので、int型(削除したデータの件数)で判断する。
        int deleteResult = companyAssignmentMapper.deleteByPrimaryKey(companyAssignmentId);
        if (deleteResult == 1) {
            return true;
        }
        return false;
    }
}
