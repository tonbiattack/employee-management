package com.employee.managementapi.exception;

/**
 * NotFoundException独自例外
 * 
 * 用法:エラーメッセージをMessageSourceから取得して設定する。
 */
public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NotFoundException(String msg) {
		super(msg);
	}
}
