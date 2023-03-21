package com.employee.managementapi.employee;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.Employee;
import com.employee.managementapi.infrastructure.employee.EmployeeMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeUpdateServiceImpl implements EmployeeUpdateService {

	private final EmployeeMapper employeeMapper;

	@Override
	public EmployeeWithPrimaryKey insert(com.employee.managementapi.employee.Employee domainEmployee) {
		Employee employee = Employee.build(domainEmployee);
		int employeeId = employeeMapper.selectNextval();
		employee.setEmployeeId(employeeId);
		employeeMapper.insert(employee);
		return domainEmployee.toDomainEmployeeWithPrimaryKey(employeeId);
	}
}
