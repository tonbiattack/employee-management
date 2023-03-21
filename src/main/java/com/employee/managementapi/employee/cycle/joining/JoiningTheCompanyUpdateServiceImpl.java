package com.employee.managementapi.employee.cycle.joining;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.JoiningTheCompany;
import com.employee.managementapi.infrastructure.employee.JoiningTheCompanyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JoiningTheCompanyUpdateServiceImpl implements JoiningTheCompanyUpdateService {

	private final JoiningTheCompanyMapper joiningTheCompanyMapper;

	@Override
	public JoiningTheCompanyWithPrimaryKey insert(
			com.employee.managementapi.employee.cycle.joining.JoiningTheCompany domainJoiningTheCompany) {
		JoiningTheCompany infraLayerjoiningTheCompany = JoiningTheCompany.build(domainJoiningTheCompany);
		int joiningTheCompanyId = joiningTheCompanyMapper.selectNextval();
		infraLayerjoiningTheCompany.setJoiningTheCompanyId(joiningTheCompanyId);
		joiningTheCompanyMapper.insert(infraLayerjoiningTheCompany);
		return domainJoiningTheCompany.toDomainJoiningTheCompanyWithPrimaryKey(joiningTheCompanyId);
	}

}
