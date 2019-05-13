package com.ultraman.exception;

import org.apache.commons.lang3.StringUtils;

import com.ultraman.util.MsgConfigReaderUtil;

import lombok.Getter;
import lombok.Setter;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -5390567366339778299L;

	@Setter
	@Getter
	private String code;

	@Setter
	@Getter
	private String message;

	@Setter
	@Getter
	private Object[] params;

	public ServiceException(String code) throws Exception {
		this.code = code;
		this.message = StringUtils.isBlank(MsgConfigReaderUtil.getValue(code)) ? code
				: MsgConfigReaderUtil.getValue(code);
	}

	public ServiceException(String code, Object[] params) throws Exception {
		this.code = code;
		this.message = StringUtils.isBlank(MsgConfigReaderUtil.getValue(code)) ? code
				: MsgConfigReaderUtil.getValue(code);
		this.params = params;
	}

	public ServiceException(String line, String code) throws Exception {
		this.code = code;
		this.message = line
				+ (StringUtils.isBlank(MsgConfigReaderUtil.getValue(code)) ? code : MsgConfigReaderUtil.getValue(code));
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

}
