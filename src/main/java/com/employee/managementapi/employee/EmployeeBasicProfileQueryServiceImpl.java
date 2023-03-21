package com.employee.managementapi.employee;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeBasicProfileQueryServiceImpl implements EmployeeBasicProfileQueryService {

	private final EmployeeBasicProfileMapper employeeBasicProfileMapper;

	@Override
	public EmployeeBasicProfileList getListByLimit(final int start, final int limit) {
		return new EmployeeBasicProfileList(employeeBasicProfileMapper
				.selectLimit(start, limit));
	}

	@Override
	public EmployeeBasicProfileList getListByEmployeeIds(EmployeeIdList employeeIdList) {
		return new EmployeeBasicProfileList(
				employeeBasicProfileMapper.selectByEmployeeId(employeeIdList.toEmployeeIds()));
	}
}
