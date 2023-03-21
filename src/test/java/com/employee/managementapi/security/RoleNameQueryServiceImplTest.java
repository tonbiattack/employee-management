package com.employee.managementapi.security;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class RoleNameQueryServiceImplTest {

	@Mock
	private RoleNameMapper roleNameMapper;

	@InjectMocks
	private RoleNameQueryServiceImpl roleNameQueryServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("SELECT TEST: 登録されているロールを検索することができる、"
			+ "既に登録されているロールが存在しない場合はfalse 既に登録されているロールが存在する場合はtrueを返す")
	@Test
	void testCheckCompanyEmailAlreadyExists() {
		//ロールネームが存在しない場合
		RoleName roleNameNone = new RoleName("FALSE");
		//ロールネームが1件存在する場合
		RoleName roleNameExists = new RoleName("ADMIN");

		when(roleNameMapper.countByRole(roleNameNone)).thenReturn(0);
		when(roleNameMapper.countByRole(roleNameExists)).thenReturn(1);

		assertAll(
				//ロールが登録されていない場合
				() -> assertFalse(roleNameQueryServiceImpl.checkExistsRole(roleNameNone)),
				//ロールが既に登録されている場合
				() -> assertTrue(roleNameQueryServiceImpl.checkExistsRole(roleNameExists)));

		verify(roleNameMapper, times(1)).countByRole(roleNameNone);
		verify(roleNameMapper, times(1)).countByRole(roleNameExists);
	}
}