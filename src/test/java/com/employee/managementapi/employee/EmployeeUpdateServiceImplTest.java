package com.employee.managementapi.employee;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.infrastructure.employee.Employee;
import com.employee.managementapi.infrastructure.employee.EmployeeMapper;

class EmployeeUpdateServiceImplTest {

	@Mock
	private EmployeeMapper employeeMapper;

	@InjectMocks
	private EmployeeUpdateServiceImpl employeeUpdateServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("INSERT TEST: employeeテーブルにインサートできているかどうか")
	@Test
	void testInsert() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1971/11/25");
		com.employee.managementapi.employee.Employee employee = new com.employee.managementapi.employee.Employee(
				1,
				1,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント",
				date,
				1,
				"React,Vue.jsなどフロントエンドに詳しい。");

		EmployeeWithPrimaryKey employeeWithPrimaryKey = new EmployeeWithPrimaryKey(
				1,
				1,
				1,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント",
				date,
				1,
				"React,Vue.jsなどフロントエンドに詳しい。");

		when(employeeMapper.insert(Mockito.any(Employee.class))).thenReturn(1);
		when(employeeMapper.selectNextval()).thenReturn(1);
		EmployeeWithPrimaryKey actual = employeeUpdateServiceImpl.insert(employee);
		assertEquals(employeeWithPrimaryKey.getEmployeeId(), actual.getEmployeeId());
		assertEquals(employeeWithPrimaryKey.getGenderId(), actual.getGenderId());
		assertEquals(employeeWithPrimaryKey.getEmployeeStatusId(), actual.getEmployeeStatusId());
		assertEquals(employeeWithPrimaryKey.getFamilyName(), actual.getFamilyName());
		assertEquals(employeeWithPrimaryKey.getLastName(), actual.getLastName());
		assertEquals(employeeWithPrimaryKey.getFamilyNameFurigana(), actual.getFamilyNameFurigana());
		assertEquals(employeeWithPrimaryKey.getLastNameFurigana(), actual.getLastNameFurigana());
		assertEquals(employeeWithPrimaryKey.getDateOfBirth(), actual.getDateOfBirth());
		assertEquals(employeeWithPrimaryKey.getGrade(), actual.getGrade());
		assertEquals(employeeWithPrimaryKey.getComment(), actual.getComment());
		verify(employeeMapper, times(1)).insert(Mockito.any(Employee.class));
	}

}
