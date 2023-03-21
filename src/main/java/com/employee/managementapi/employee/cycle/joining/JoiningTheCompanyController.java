package com.employee.managementapi.employee.cycle.joining;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

/**
 * 入社イベントのコントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "入社")
@RequestMapping("api/v1/employees/cycles/joinings")
public class JoiningTheCompanyController {
	private final JoiningTheCompanyUpdateService joiningTheCompanyUpdateService;

	/**
	 * 社員が入社した
	 * 
	 * @param joiningTheCompany 入社
	 * @return 入社 主キー付きs
	 */
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "登録したデータ"),
	@ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "社員を入社させます。")
	public JoiningTheCompanyWithPrimaryKey insert(
			@ApiParam(value = "入社") @Validated @RequestBody final JoiningTheCompany joiningTheCompany) {
		return joiningTheCompanyUpdateService.insert(joiningTheCompany);
	}
}
