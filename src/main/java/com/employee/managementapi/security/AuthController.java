package com.employee.managementapi.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.employee.managementapi.aop.ExceptionResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

/**
 * 認証コントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "認証")
@RequestMapping("api/v1/auth")
public class AuthController {

	private final AuthUpdateServiceCoordinator authUpdateServiceCoordinator;

	private final AuthQueryServiceCoordinator authQueryServiceCoordinator;

	/**
	 * サインイン処理
	 * 
	 * @param signInDto サインインDTO
	 * @return JWTトークン
	 */

	@PostMapping("/signin")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "JWTトークン"),
			@ApiResponse(code = 500, message = "メールアドレスorパスワードが間違っている", response = ExceptionResponse.class) })
	@ResponseStatus(code = HttpStatus.OK)
	@ApiOperation(value = "サインインします。")
	public JwtAuth authenticateUser(@ApiParam(value = "サインイン") @RequestBody SignInDto signInDto) {
		return authQueryServiceCoordinator.authenticateUser(signInDto);
	}

	/**
	 * サインアップ処理
	 * 
	 * @param signUpDto サインアップDTO
	 * @return 登録したデータの各主キー付きサインアップDTO
	 */
	@PostMapping("/signup")
	@ResponseStatus(code = HttpStatus.CREATED)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "登録したデータ"),
			@ApiResponse(code = 400, message = "Bad Request") })
	@ApiOperation(value = "サインアップしてアカウントを作成します。", notes = "登録できるメールアドレスは会社メールアドレスのみです。")
	public SignUpDtoWithPrimaryKey registerUser(@ApiParam(value = "サインアップ") @RequestBody SignUpDto signUpDto) {
		return authUpdateServiceCoordinator.registerUser(signUpDto);
	}
}
