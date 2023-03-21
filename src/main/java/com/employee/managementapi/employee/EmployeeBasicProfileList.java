package com.employee.managementapi.employee;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

/**
 * 社員基本情報リスト
 */
@Getter
public class EmployeeBasicProfileList {
	private final List<EmployeeBasicProfile> employeeBasicProfiles;

	EmployeeBasicProfileList() {
		employeeBasicProfiles = new ArrayList<EmployeeBasicProfile>();
	}

	public EmployeeBasicProfileList(final List<EmployeeBasicProfile> employeeBasicProfiles) {
		this.employeeBasicProfiles = employeeBasicProfiles;
	}

	/**
	 * employeeBasicProfilesのサイズを返す。コレクションをラップしている
	 * 
	 * @return employeeBasicProfilesのサイズ
	 */
	public int size() {
		return employeeBasicProfiles.size();
	}

	public EmployeeBasicProfile get(int index) {
		return employeeBasicProfiles.get(index);
	}
}
