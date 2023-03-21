package com.employee.managementapi.employee.skill;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

/**
 * 社員スキルコントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "社員スキル")
@RequestMapping("api/v1/employees/skills")
public class EmployeeSkillController {
	private final EmployeeSkillSearchQueryServiceCoordinator employeeSkillSearchQueryServiceCoordinator;

	/**
	 * 社員スキルを複数の条件で検索する。
	 * ※複雑な条件で検索をするため、RequestBodyを使用したいのでPOSTを使用する。
	 * ※検索対象以外の社員が持っているスキルに関しても返却します
	 * 
	 * @param employeeSkill 社員スキル
	 * @return 社員の保有しているスキル。
	 */
	@PostMapping("/search")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "取得したデータ"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ResponseStatus(code = HttpStatus.OK)
	@ApiOperation(value = "社員のスキルを複数条件で検索します。", notes = "※複雑な条件で検索をするため、RequestBodyを使用したいのでPOSTを使用する。\r\n"
			+ "※検索対象スキル以外の社員が持っているスキルに関しても返却します")
	public EmployeeSkillSearchList employeeSkillSearch(
			@ApiParam(value = "検索スキル") @RequestBody EmployeeSkill employeeSkill) {
		return employeeSkillSearchQueryServiceCoordinator
				.multiSkillFilter(employeeSkill);
	}
}
