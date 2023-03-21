package com.employee.managementapi.employee.skill.database;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
 * 社員データベーススキルコントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "社員データベーススキル")
@RequestMapping("api/v1/employees/skills/databases")
public class EmployeeDatabaseSkillController {
	private final EmployeeDatabaseSkillUpdateService employeeDatabaseSkillUpdateService;
	private final EmployeeDatabaseSkillQueryService employeeDatabaseSkillQueryService;

	/**
	 * 現役社員のデータベーススキルを全件取得します。退職社員のデータベーススキルは取得しません
	 * 
	 * @return 現役社員全員のデータベーススキル。一人の社員IDに対して複数のスキルが結びつきます。1対多。詳しくはSwagger参照
	 */
	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "取得したデータ"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "社員のデータベーススキルを全件取得します。", notes = "退職社員のデータベーススキルは取得しません")
	public EmployeeDatabaseSkillList getList() {
		return employeeDatabaseSkillQueryService.getList();
	}

	/**
	 * 社員のデータベーススキルを一件更新します。
	 * 
	 * @param employeeDatabaseSkill 社員データベーススキル
	 * @return 更新した社員データベーススキルのデータ
	 */
	@PatchMapping()
	@ResponseStatus(code = HttpStatus.OK)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "更新したデータ"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "社員のデータベーススキルのレベルを更新します。")
	public EmployeeDatabaseSkill patch(
			@ApiParam(value = "社員データベーススキル") @Validated @RequestBody final EmployeeDatabaseSkill employeeDatabaseSkill) {
		return employeeDatabaseSkillUpdateService.update(employeeDatabaseSkill);
	}

	/**
	 * 社員のデータベーススキルを一件削除します。
	 * 
	 * @param employeeDatabaseSkillId 削除する社員のデータベーススキルID
	 * @return 削除した社員のデータベーススキルID
	 */
	@DeleteMapping("/{employeeDatabaseSkillId}")
	@ApiOperation(value = "社員データベーススキルを削除します。")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@ApiResponses(value = { @ApiResponse(code = 204, message = "削除完了"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "権限がない"),
			@ApiResponse(code = 400, message = "Bad Request") })
	public void delete(
			@ApiParam(value = "社員データベーススキルID", example = "1") @PathVariable final int employeeDatabaseSkillId) {
		employeeDatabaseSkillUpdateService.delete(employeeDatabaseSkillId);
	}
}
