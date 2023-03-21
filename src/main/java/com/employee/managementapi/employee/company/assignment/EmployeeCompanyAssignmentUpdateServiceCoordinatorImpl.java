package com.employee.managementapi.employee.company.assignment;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.employee.company.belonging.EmployeeBelongingCompany;
import com.employee.managementapi.employee.company.belonging.EmployeeBelongingCompanyUpdateService;
import com.employee.managementapi.employee.company.belonging.EmployeeBelongingCompanyWithPrimaryKey;
import com.employee.managementapi.exception.NotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class EmployeeCompanyAssignmentUpdateServiceCoordinatorImpl
		implements EmployeeCompanyAssignmentUpdateServiceCoordinator {

	private final EmployeeAssignmentCompanyUpdateService employeeAssignmentCompanyUpdateService;

	private final EmployeeBelongingCompanyUpdateService employeeBelongingCompanyUpdateService;

	private final MessageSource messageSource;

	@Override
	public EmployeeCompanyAssignmentWithPrimaryKey assignment(EmployeeCompanyAssignment employeeCompanyAssignment) {
		EmployeeAssignmentCompany employeeAssignmentCompany = employeeCompanyAssignment
				.toEmployeeAssignmentCompany();
		EmployeeAssignmentCompanyWithPrimaryKey employeeAssignmentCompanyWithPrimaryKey = employeeAssignmentCompanyUpdateService
				.insert(employeeAssignmentCompany);

		EmployeeBelongingCompany employeeBelongingCompany = employeeCompanyAssignment
				.toEmployeeBelongingCompany();
		EmployeeBelongingCompanyWithPrimaryKey employeeBelongingCompanyWithPrimaryKey = employeeBelongingCompanyUpdateService
				.insert(employeeBelongingCompany);

		EmployeeCompanyAssignmentWithPrimaryKey companyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
				employeeAssignmentCompanyWithPrimaryKey.getCompanyAssignmentId(),
				employeeBelongingCompanyWithPrimaryKey.getBelongingCompanyId(),
				employeeCompanyAssignment.getCompanyId(),
				employeeCompanyAssignment.getEmployeeId(),
				employeeCompanyAssignment.getCompanyAssignmentDate());
		return companyAssignmentWithPrimaryKey;
	}

	@Override
	public EmployeeCompanyAssignmentWithPrimaryKey jobAssignmentSystem(
			EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey) {
		EmployeeAssignmentCompany employeeAssignmentCompany = employeeCompanyAssignmentWithPrimaryKey
				.toEmployeeAssignmentCompanyWithPrimaryKey();
		EmployeeAssignmentCompanyWithPrimaryKey employeeAssignmentCompanyWithPrimaryKey = employeeAssignmentCompanyUpdateService
				.insert(employeeAssignmentCompany);

		EmployeeBelongingCompanyWithPrimaryKey employeeBelongingCompanyWithPrimaryKey = employeeCompanyAssignmentWithPrimaryKey
				.toEmployeeBelongingCompanyWithPrimaryKey();
		employeeBelongingCompanyUpdateService
				.update(employeeBelongingCompanyWithPrimaryKey);

		EmployeeCompanyAssignmentWithPrimaryKey companyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
				employeeAssignmentCompanyWithPrimaryKey.getCompanyAssignmentId(),
				employeeBelongingCompanyWithPrimaryKey.getBelongingCompanyId(),
				employeeCompanyAssignmentWithPrimaryKey.getCompanyId(),
				employeeCompanyAssignmentWithPrimaryKey.getEmployeeId(),
				employeeCompanyAssignmentWithPrimaryKey.getCompanyAssignmentDate());
		return companyAssignmentWithPrimaryKey;

	}

	@Override
	public void delete(int companyAssignmentId, int belongingCompanyId) {
		boolean companyAssignmentResult = employeeAssignmentCompanyUpdateService.delete(companyAssignmentId);
		boolean belongingCompanyResult = employeeBelongingCompanyUpdateService.delete(belongingCompanyId);
		// 削除するリソースが存在しない場合
		if (!(companyAssignmentResult && belongingCompanyResult)) {
			throw new NotFoundException(
					messageSource.getMessage("delete.resource.does.not.exist",
							new Object[] {}, Locale.getDefault()));
		}
	}
}
