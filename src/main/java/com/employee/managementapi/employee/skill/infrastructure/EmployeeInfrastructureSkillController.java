package com.employee.managementapi.employee.skill.infrastructure;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

/**
 * 社員インフラスキルコントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "社員インフラスキル")
@RequestMapping("api/v1/employees/skills/infrastructures")
public class EmployeeInfrastructureSkillController {

	private final EmployeeInfrastructureSkillQueryService employeeInfrastructureSkillQueryService;

	/**
	 * 社員のインフラスキルリストを取得する。
	 * 
	 * @return EmployeeInfrastructureSkillList 社員インフラスキルリスト
	 */
	@GetMapping()
	@ApiResponses(value = { @ApiResponse(code = 200, message = "取得したデータ"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ResponseStatus(code = HttpStatus.OK)
	@ApiOperation(value = "社員のインフラスキルを全件取得します。")
	public EmployeeInfrastructureSkillList getList() {
		return employeeInfrastructureSkillQueryService.getList();
	}
}
