package com.employee.managementapi.aop;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.employee.managementapi.exception.BadRequestException;
import com.employee.managementapi.exception.NotFoundException;

/**
 * 例外処理を行うハンドラークラス
 */
@ControllerAdvice
@RestController
public class ApiExceptionHandler {

	/**
	 * APIのURLが不正な場合のエラー処理を行う。
	 * 
	 * @param ex MethodArgumentTypeMismatch例外
	 * @return レスポンスエンティティオブジェクト
	 */
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ExceptionResponse> handleMethodArgumentTypeMismatchException(
			MethodArgumentTypeMismatchException ex) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				ex.getMessage());
		return new ResponseEntity<ExceptionResponse>(
				exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	/**
	 * クラスのチェック処理でエラーになった場合の処理を行う。
	 * 
	 * @param ex MethodArgumentNotValid例外
	 * @return レスポンスエンティティオブジェクト
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionResponse> handleMethodArgumentNotValidException(
			MethodArgumentNotValidException ex) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				getMethodArgumentNotValidExceptionMsg(ex));
		return new ResponseEntity<ExceptionResponse>(
				exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	/**
	 *  BadRequestException独自例外を発生させた場合の処理を行う。
	 * 
	 * @param ex BadRequest例外
	 * @return レスポンスエンティティオブジェクト
	 */
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ExceptionResponse> handleBadRequestException(BadRequestException ex) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				ex.getMessage());
		return new ResponseEntity<ExceptionResponse>(
				exceptionResponse, HttpStatus.BAD_REQUEST);
	}

	/**
	 *  NotFoundException独自例外を発生させた場合の処理を行う。
	 * 
	 * @param ex NotFoundException例外
	 * @return レスポンスエンティティオブジェクト
	 */
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleBadRequestExceptiona(NotFoundException ex) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				ex.getMessage());
		return new ResponseEntity<ExceptionResponse>(
				exceptionResponse, HttpStatus.NOT_FOUND);
	}

	/**
	 * その他例外が発生した場合の処理を行う。
	 * 
	 * @param ex 任意例外
	 * @return レスポンスエンティティオブジェクト
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleException(Exception ex) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				ex.getMessage());
		return new ResponseEntity<ExceptionResponse>(
				exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * MethodArgumentNotValid例外からエラーメッセージを生成する。
	 * 
	 * @param ex MethodArgumentNotValid例外
	 * @return エラーメッセージ
	 */
	private String getMethodArgumentNotValidExceptionMsg(
			MethodArgumentNotValidException ex) {
		StringBuilder errMsg = new StringBuilder();
		if (ex.getFieldErrorCount() > 0) {
			List<FieldError> fieldErrorList = ex.getFieldErrors();
			for (FieldError error : fieldErrorList) {
				errMsg.append(error.getField());
				errMsg.append(": ");
				errMsg.append(error.getDefaultMessage());
				errMsg.append("; ");
			}
		}
		if (ex.getGlobalErrorCount() > 0) {
			List<ObjectError> objectErrorList = ex.getGlobalErrors();
			for (ObjectError error : objectErrorList) {
				errMsg.append(error.getDefaultMessage());
			}
		}
		return errMsg.toString();
	}
}