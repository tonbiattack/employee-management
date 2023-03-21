package com.employee.managementapi.employee;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

/**
 * 社員コントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "社員")
@RequestMapping("api/v1/employees")
public class EmployeeController {
	private final EmployeeBasicProfileQueryService employeeBasicProfileQueryService;

	private final EmployeeUpdateService employeeUpdateService;

	/**
	 * 名前、社員番号などの社員の基本情報を参照します(現役社員のみ)
	 * 
	 * @param zeroBasedStart 取得開始件数(0始まり)
	 * @param limit          取得件数
	 * @return 社員基本情報リスト
	 */
	@GetMapping("/basic-profiles")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "取得したデータ"),
	@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "現役社員の名前、社員番号などの基本情報を参照します。", notes = "パラメーター\"start\"の現役社員IDから昇順に、パラメーター\"limit\"件数取得します。\"start\"がない場合は0件から\"limit\"件数取得します。退職した社員は取得しません。")
	public EmployeeBasicProfileList getEmployeeBasicProfileList(
			@ApiParam(value = "取得開始件数", example = "1") @RequestParam(name = "start", required = false, defaultValue = "0") final int zeroBasedStart,
			@ApiParam(value = "取得件数", example = "2") @RequestParam("limit") final int limit) {
		// startが0始まりだと直感的ではないので、1始まりにしておくSQLのLIMIT OFFSET参照
		if (zeroBasedStart != 0) {
			final int oneBasedStart = zeroBasedStart - 1;
			return employeeBasicProfileQueryService.getListByLimit(oneBasedStart, limit);
		}
		return employeeBasicProfileQueryService.getListByLimit(zeroBasedStart, limit);
	}

	/**
	 * 社員情報を一件登録する
	 * 
	 * @param employee 社員情報
	 * @return 社員情報主キー付き
	 */
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "登録したデータ"),
	@ApiResponse(code = 400, message = "Bad Request"),
	@ApiResponse(code = 401, message = "Unauthorized") })
	@ApiOperation(value = "社員情報を登録します。")
	public EmployeeWithPrimaryKey insert(
			@ApiParam(value = "社員情報") @Validated @RequestBody final Employee employee) {
		return employeeUpdateService.insert(employee);
	}
}
