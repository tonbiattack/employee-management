package com.employee.managementapi.employee;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EmployeeBasicProfileQueryServiceImplTest {

	@Mock
	private EmployeeBasicProfileMapper employeeBasicProfileMapper;

	@InjectMocks
	private EmployeeBasicProfileQueryServiceImpl employeeBasicProfileQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: 社員基本情報を任意の件数取得することが出来ているか")
	@Test
	void testSelectLimit() throws ParseException {
		EmployeeBasicProfile employeeBasicProfile1 = new EmployeeBasicProfile(
				26,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント");
		EmployeeBasicProfile employeeBasicProfile2 = new EmployeeBasicProfile(
				27,
				"27",
				"中田",
				"あやか",
				"ナカタ",
				"アヤカ");

		List<EmployeeBasicProfile> employeeBasicProfiles = new ArrayList<>();
		employeeBasicProfiles.add(employeeBasicProfile1);
		employeeBasicProfiles.add(employeeBasicProfile2);

		when(employeeBasicProfileMapper.selectLimit(5, 2)).thenReturn(employeeBasicProfiles);
		EmployeeBasicProfileList actuals = employeeBasicProfileQueryServiceImpl.getListByLimit(5, 2);
		assertEquals(2, actuals.size());
		verify(employeeBasicProfileMapper, times(1)).selectLimit(5, 2);
	}

	@DisplayName("SELECT TEST: 社員基本情報を社員IDで検索することが出来るか")
	@Test
	void testSelectByEmployeeIds() throws ParseException {
		EmployeeId employeeId1 = new EmployeeId(26);
		EmployeeId employeeId2 = new EmployeeId(27);
		List<EmployeeId> employeeIds = new ArrayList<>();
		EmployeeIdList employeeIdList = new EmployeeIdList(employeeIds);

		employeeIds.add(employeeId1);
		employeeIds.add(employeeId2);
		EmployeeBasicProfile employeeBasicProfile1 = new EmployeeBasicProfile(
				26,
				"26",
				"田嶋",
				"研人",
				"タジマ",
				"ケント");
		EmployeeBasicProfile employeeBasicProfile2 = new EmployeeBasicProfile(
				27,
				"27",
				"中田",
				"あやか",
				"ナカタ",
				"アヤカ");

		List<EmployeeBasicProfile> employeeBasicProfiles = new ArrayList<>();
		employeeBasicProfiles.add(employeeBasicProfile1);
		employeeBasicProfiles.add(employeeBasicProfile2);

		when(employeeBasicProfileMapper.selectByEmployeeId(employeeIds)).thenReturn(employeeBasicProfiles);
		EmployeeBasicProfileList actuals = employeeBasicProfileQueryServiceImpl.getListByEmployeeIds(employeeIdList);
		assertEquals(2, actuals.size());
		verify(employeeBasicProfileMapper, times(1)).selectByEmployeeId(employeeIds);
	}

}
