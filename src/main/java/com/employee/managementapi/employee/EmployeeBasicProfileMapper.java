package com.employee.managementapi.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeBasicProfileMapper {
	/**
	 * 社員基本情報を任意の件数取得。※取得するのは現役社員のみで退職社員は取得しない。
	 * 
	 * @param start 取得開始件数
	 * @param limit 取得件数
	 * @return 社員基本情報
	 */
	List<EmployeeBasicProfile> selectLimit(@Param("start") int start,
			@Param("limit") int limit);

	/**
	 * 社員IDに紐づく社員基本情報を取得。
	 * 
	 * @param employeeIds 社員ID
	 * @return 社員基本情報
	 */
	List<EmployeeBasicProfile> selectByEmployeeId(List<EmployeeId> employeeIds);
}
