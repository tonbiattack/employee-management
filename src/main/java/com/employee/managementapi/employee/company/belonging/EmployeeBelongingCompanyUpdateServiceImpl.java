package com.employee.managementapi.employee.company.belonging;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.BelongingCompany;
import com.employee.managementapi.infrastructure.employee.BelongingCompanyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeBelongingCompanyUpdateServiceImpl implements EmployeeBelongingCompanyUpdateService {

    private final BelongingCompanyMapper belongingCompanyMapper;

    @Override
    public EmployeeBelongingCompanyWithPrimaryKey insert(EmployeeBelongingCompany employeeBelongingCompany) {
        BelongingCompany belongingCompany = BelongingCompany.build(employeeBelongingCompany);
        int belongingCompanyId = belongingCompanyMapper.selectNextval();
        belongingCompany.setBelongingCompanyId(belongingCompanyId);
        belongingCompanyMapper.insert(belongingCompany);
        return new EmployeeBelongingCompanyWithPrimaryKey(belongingCompanyId, employeeBelongingCompany.getCompanyId(),
                employeeBelongingCompany.getEmployeeId());
    }

    @Override
    public EmployeeBelongingCompanyWithPrimaryKey update(
            EmployeeBelongingCompanyWithPrimaryKey employeeBelongingCompanyWithPrimaryKey) {
        BelongingCompany belongingCompany = employeeBelongingCompanyWithPrimaryKey.toBelongingCompany();
        belongingCompanyMapper.updateByPrimaryKey(belongingCompany);
        return employeeBelongingCompanyWithPrimaryKey;
    }

    @Override
    public boolean delete(int belongingCompanyId) {
        // 本来は削除されたリソースがあるのかどうかboolean型で返したいが、MyBatis
        // Generatorで自動生成されたファイルを使うことで変更に強くしたいので、int型(削除したデータの件数)で判断する。
        int deleteResult = belongingCompanyMapper.deleteByPrimaryKey(belongingCompanyId);
        if (deleteResult == 1) {
            return true;
        }
        return false;
    }

}
