package com.employee.managementapi.employee.skill.framework;

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
 * 社員フレームワークスキルコントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "社員フレームワークスキル")
@RequestMapping("api/v1/employees/skills/frameworks")
public class EmployeeFrameworkSkillController {
	private final EmployeeFrameworkSkillQueryService employeeFrameworkSkillQueryService;

	/**
	 * 現役社員フレームワークスキル全件取得します。退職社員のフレームワークスキルは取得しません
	 * 
	 * @return 現役社員全員のフレームワークスキル。一人の社員IDに対して複数のスキルが結びつきます。1対多。詳しくはSwagger参照
	 */
	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "取得したデータ"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "社員フレームワークスキルを全件取得します。")
	public EmployeeFrameworkSkillList getList() {
		return employeeFrameworkSkillQueryService.getList();
	}
}
