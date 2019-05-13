package com.ultraman.exception;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.ultraman.util.MessageUtils;
import com.ultraman.util.MsgConfigReaderUtil;

/**
 * @author
 */
public class Result<T> implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -5718188987761447040L;

	private boolean success;
	private T dataModel;
	private ResultCode resultCode;
	private String message;
	private String code;
	private List<String> msg;

	/**
	 * 执行成功，有返回值
	 * 
	 * @param t
	 * @return
	 */
	public static <T> Result<T> successResult(T t) {
		Result<T> result = new Result<>();
		result.setSuccess(true);
		result.setResultCode(ResultCode.SYS_EXECUTE_SUCCESS);
		result.setMessage(ResultCode.SYS_EXECUTE_SUCCESS.getMsg());
		result.setDataModel(t);
		return result;
	}

	/**
	 * 执行成功，无返回值
	 * 
	 * @return
	 */
	public static <T> Result<T> successResult() {
		Result<T> result = new Result<>();
		result.setSuccess(true);
		result.setResultCode(ResultCode.SYS_EXECUTE_SUCCESS);
		result.setMessage(ResultCode.SYS_EXECUTE_SUCCESS.getMsg());
		return result;
	}

	/**
	 * 执行成功，返回特定提示信息
	 * 
	 * @param resultCode
	 * @param t
	 * @return
	 */
	public static <T> Result<T> successResult(ResultCode resultCode, T t) {
		Result<T> result = new Result<>();
		result.setSuccess(true);
		result.setResultCode(resultCode);
		result.setDataModel(t);
		return result;
	}

	/**
	 * 执行成功，返回特定提示信息
	 * 
	 * @param code
	 * @return
	 */
	public static <T> Result<T> successResultBycode(String code) {
		Result<T> result = new Result<>();
		result.setSuccess(true);
		result.setCode(code);
		result.setMessage(MessageUtils.getMessage(code));
		return result;
	}

	/**
	 * 执行成功，返回特定提示信息
	 * 
	 * @param code
	 * @return
	 */
	public static <T> Result<T> successResultWithMsg(String message) {
		Result<T> result = new Result<>();
		result.setSuccess(true);
		result.setResultCode(ResultCode.SYS_EXECUTE_SUCCESS);
		result.setMessage(message);
		return result;
	}

	/**
	 * 返回指定code集合
	 * 
	 * @param msg
	 * @return
	 */
	public static <T> Result<T> failResultBycodeList(List<String> msg) {
		Result<T> result = new Result<>();
		result.setSuccess(false);
		result.setMsg(msg);
		return result;
	}

	/**
	 * 执行错误，返回自定义信息
	 * 
	 * @param message
	 * @return
	 */
	public static <T> Result<T> failResultWithMsg(String message) {
		Result<T> result = new Result<>();
		result.setSuccess(false);
		result.setResultCode(ResultCode.SYS_EXECUTE_EXCEPTION);
		if (!StringUtils.isEmpty(message)) {
			result.setMessage(message);
		}
		return result;
	}

	/**
	 * 执行错误，返回特定提示信息
	 * 
	 * @param resultCode
	 * @param t
	 * @return
	 */
	public static <T> Result<T> failResult(ResultCode resultCode) {
		Result<T> result = new Result<>();
		result.setSuccess(false);
		result.setResultCode(resultCode);
		result.setMessage(resultCode.getMsg());
		return result;
	}

	/**
	 * 执行错误
	 * 
	 * @param message
	 * @return
	 */
	public static <T> Result<T> failResult(String code, String message) {
		Result<T> result = new Result<>();
		result.setSuccess(false);
		result.setCode(code);
		result.setMessage(message);
		return result;
	}

	/**
	 * 执行错误
	 * 
	 * @param message
	 * @return
	 */
	public static <T> Result<T> failResult(String code) {
		Result<T> result = new Result<>();
		result.setSuccess(false);
		result.setCode(code);
		result.setMessage(MsgConfigReaderUtil.getValue(code));
		return result;
	}

	@Override
	public String toString() {
		return isSuccess() + "[ResultCode : " + getResultCode() + "] [defaultModel : " + getDataModel() + "]";
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getDataModel() {
		return dataModel;
	}

	public void setDataModel(T dataModel) {
		this.dataModel = dataModel;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResultCode getResultCode() {
		return resultCode;
	}

	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getMsg() {
		return msg;
	}

	public void setMsg(List<String> msg) {
		this.msg = msg;
	}

}
