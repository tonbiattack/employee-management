package com.employee.managementapi.security;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyEmailQueryServiceImpl implements CompanyEmailQueryService {

	private final CompanyEmailMapper companyEmailMapper;

	@Override
	public boolean checkAlreadyExistsEmailAsPassword(CompanyEmail checkEmail) {
		int alreadyExistsEmailCount = companyEmailMapper
				.countByCompanyEmailAsPassword(checkEmail);
		if (alreadyExistsEmailCount == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int getActiveEmployeeContactInformationId(CompanyEmail companyEmail) {
		return companyEmailMapper
				.selectActiveEmployeeContactInformationIdByEmail(companyEmail);
	}

	@Override
	public boolean checkAlreadyExistsCompanyEmailAsCompanyEmail(CompanyEmail checkEmail) {
		int alreadyExistsEmailCount = companyEmailMapper
				.countByCompanyEmailAsActiveEmployeeCompanyEmail(checkEmail);
		if (alreadyExistsEmailCount == 1) {
			return true;
		}
		return false;
	}
}
