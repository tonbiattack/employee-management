package com.employee.managementapi.company;

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
 * 会社コントローラー
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/companys")
@Api(tags = "会社")
public class CompanyController {
	private final CompanyUpdateService companyUpdateService;

	/**
	 * グループ会社を新たに追加します。
	 * 
	 * @param company 会社
	 * @return 追加した会社
	 */
	@PostMapping()
	@ApiResponses(value = { @ApiResponse(code = 201, message = "登録したデータ"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ResponseStatus(code = HttpStatus.CREATED)
	@ApiOperation(value = "会社を新たに追加します。")
	public CompanyWithPrimaryKey insert(
			@ApiParam(value = "会社") @Validated @RequestBody final Company company) {
		return companyUpdateService.insert(company);
	}

}
