package com.employee.managementapi.employee.cycle.joining;

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

import com.employee.managementapi.infrastructure.employee.JoiningTheCompany;
import com.employee.managementapi.infrastructure.employee.JoiningTheCompanyMapper;

public class JoiningTheCompanyUpdateServiceImplTest {

	@Mock
	private JoiningTheCompanyMapper joiningTheCompanyMapper;

	@InjectMocks
	private JoiningTheCompanyUpdateServiceImpl joiningTheCompanyUpdateServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("INSERT TEST: 入社イベントを登録できているかどうか")
	@Test
	void testInsert() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1993/06/01");

		com.employee.managementapi.employee.cycle.joining.JoiningTheCompany domainJoiningTheCompany = new com.employee.managementapi.employee.cycle.joining.JoiningTheCompany(
				1, date);
		JoiningTheCompanyWithPrimaryKey domainJoiningTheCompanyWithPrimaryKey = new JoiningTheCompanyWithPrimaryKey(
				1, 1, date);
		when(joiningTheCompanyMapper.insert(Mockito.any(JoiningTheCompany.class))).thenReturn(1);
		when(joiningTheCompanyMapper.selectNextval()).thenReturn(1);
		JoiningTheCompanyWithPrimaryKey actual = joiningTheCompanyUpdateServiceImpl
				.insert(domainJoiningTheCompany);
		assertEquals(domainJoiningTheCompanyWithPrimaryKey.getJoiningTheCompanyId(), actual.getJoiningTheCompanyId());
		assertEquals(domainJoiningTheCompanyWithPrimaryKey.getEmployeeId(), actual.getEmployeeId());
		assertEquals(domainJoiningTheCompanyWithPrimaryKey.getJoiningTheCompanyDate(),
				actual.getJoiningTheCompanyDate());
		verify(joiningTheCompanyMapper, times(1)).insert(Mockito.any(JoiningTheCompany.class));
	}
}
