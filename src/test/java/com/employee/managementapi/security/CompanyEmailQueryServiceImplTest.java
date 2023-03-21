package com.employee.managementapi.security;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CompanyEmailQueryServiceImplTest {

	@Mock
	private CompanyEmailMapper companyEmailMapper;

	@InjectMocks
	private CompanyEmailQueryServiceImpl companyEmailQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: パスワードに登録されているメールアドレスを検索することができる、"
			+ "既に登録されているメールアドレスが存在しない場合はtrue 既に登録されているメールアドレスが存在する場合はfalseを返す")
	@Test
	void testCheckCompanyEmailAlreadyExists() {
		//メールアドレスが存在しない場合
		CompanyEmail companyEmailNone = new CompanyEmail("false@example.co.jp");
		//メールアドレスが1件存在する場合
		CompanyEmail companyEmailExists = new CompanyEmail("hayamamasahiro@example.co.jp");

		when(companyEmailMapper.countByCompanyEmailAsPassword(companyEmailNone)).thenReturn(0);
		when(companyEmailMapper.countByCompanyEmailAsPassword(companyEmailExists)).thenReturn(1);

		assertAll(
				//メールアドレスが登録されていない場合
				() -> assertTrue(companyEmailQueryServiceImpl.checkAlreadyExistsEmailAsPassword(companyEmailNone)),
				//メールアドレスが既に登録されている場合
				() -> assertFalse(companyEmailQueryServiceImpl.checkAlreadyExistsEmailAsPassword(companyEmailExists)));

		verify(companyEmailMapper, times(1)).countByCompanyEmailAsPassword(companyEmailNone);
		verify(companyEmailMapper, times(1)).countByCompanyEmailAsPassword(companyEmailExists);
	}

	@DisplayName("SELECT TEST: 現役社員の連絡先IDを取得する")
	@Test
	void testGetActiveEmployeeContactInformationId() {
		CompanyEmail companyEmail = new CompanyEmail("hayamamasahiro@example.co.jp");

		when(companyEmailMapper.selectActiveEmployeeContactInformationIdByEmail(companyEmail)).thenReturn(1);
		int actual = companyEmailQueryServiceImpl.getActiveEmployeeContactInformationId(companyEmail);
		assertEquals(1, actual);

		verify(companyEmailMapper, times(1)).selectActiveEmployeeContactInformationIdByEmail(companyEmail);
	}
}
