package com.employee.managementapi.skill.database;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
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
 * データベーススキルコントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "データベーススキル")
@RequestMapping("api/v1/skills/databases")
public class DatabaseSkillController {
	private final DatabaseSkillUpdateService databaseSkillNameUpdateService;

	/**
	 * データベーススキル登録
	 * 
	 * @param databaseSkillName 登録するデータベーススキル
	 * @return 登録したデータベーススキル主キー付き
	 */
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "登録したデータ"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "データベーススキルを新たに追加します。")
	public DatabaseSkillNameWithPrimaryKey insert(
			@ApiParam(value = "データベーススキル名") @Validated @RequestBody final DatabaseSkillName databaseSkillName) {
		return databaseSkillNameUpdateService.insert(databaseSkillName);
	}
}
