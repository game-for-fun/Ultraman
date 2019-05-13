package com.ultraman.exception;

/**
 * @author
 */
public enum ResultCode {

	/**
	 * 执行成功
	 */
	SYS_EXECUTE_SUCCESS(1000, "执行成功"),

	/**
	 * 发生异常
	 */
	SYS_EXECUTE_EXCEPTION(1001, "发生未知系统异常，请联系我们"),

	/**
	 * 登录信息无效
	 */
	SYS_EXECUTE_LOGIN_TIMEOUT(9999, "用户登录信息无效，请重新登录");

	private int errorCode;
	private String msg;

	ResultCode(int errorCode, String msg) {
		this.errorCode = errorCode;
		this.msg = msg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getMsg() {
		return msg;
	}
}
