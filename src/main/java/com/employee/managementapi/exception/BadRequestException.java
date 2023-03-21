package com.employee.managementapi.exception;

/**
 * BadRequestException独自例外
 * 
 * 用法:エラーメッセージをMessageSourceから取得して設定する。
 */
public class BadRequestException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BadRequestException(String msg) {
		super(msg);
	}
}
