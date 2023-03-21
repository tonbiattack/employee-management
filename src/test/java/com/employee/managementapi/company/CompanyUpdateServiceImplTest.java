package com.employee.managementapi.company;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.infrastructure.employee.Company;
import com.employee.managementapi.infrastructure.employee.CompanyMapper;

/**
 * 会社登録サービステスト
 */
public class CompanyUpdateServiceImplTest {

	@Mock
	private CompanyMapper companyMapper;

	@InjectMocks
	private CompanyUpdateServiceImpl companyUpdateServiceImpl;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@DisplayName("CREATE TEST: company(会社)が登録できているかどうか")
	@Test
	void testInsert() {
		CompanyWithPrimaryKey domainCompanyWithPrimaryKey = new CompanyWithPrimaryKey(1, "1", "有限会社インフィニティ",
				"インフラの運用保守");
		com.employee.managementapi.company.Company domainCompany = new com.employee.managementapi.company.Company("1",
				"有限会社インフィニティ",
				"インフラの運用保守");
		when(companyMapper.insert(Mockito.any(Company.class))).thenReturn(1);
		when(companyMapper.selectNextval()).thenReturn(1);
		CompanyWithPrimaryKey actual = companyUpdateServiceImpl.insert(domainCompany);
		assertEquals(domainCompanyWithPrimaryKey.getCompanyId(),
				actual.getCompanyId());
		assertEquals(domainCompanyWithPrimaryKey.getCompanyCode(), actual.getCompanyCode());
		assertEquals(domainCompanyWithPrimaryKey.getCompanyName(), actual.getCompanyName());
		assertEquals(domainCompanyWithPrimaryKey.getCompanyBusinessContent(), actual.getCompanyBusinessContent());
		verify(companyMapper, times(1)).insert(Mockito.any(Company.class));
	}
}
