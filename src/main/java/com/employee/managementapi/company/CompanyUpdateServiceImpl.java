package com.employee.managementapi.company;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.CompanyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyUpdateServiceImpl implements CompanyUpdateService {

	private final CompanyMapper companyMapper;

	@Override
	public CompanyWithPrimaryKey insert(Company domainCompany) {
		com.employee.managementapi.infrastructure.employee.Company infraLayerCompany = com.employee.managementapi.infrastructure.employee.Company
				.build(domainCompany);
		int companyId = companyMapper.selectNextval();
		infraLayerCompany.setCompanyId(companyId);
		companyMapper.insert(infraLayerCompany);
		return domainCompany.toCompanyWithPrimaryKey(companyId);
	}
}
