package com.ultraman.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

@Component
public class MessageSourceHolder {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageSourceHolder.class);

	@Qualifier(value = "messageSource")
	@Autowired
	private MessageSource messageSource;

	/**
	 * 设置当前的返回信息
	 * 
	 * @param request
	 * @param code
	 * @return
	 */
	public String getMessage(HttpServletRequest request, String code, Object[] params) {
		String lauage = request.getHeader("language");
		// 默认没有就是请求地区的语言
		Locale locale = null;
		if (lauage == null) {
			locale = request.getLocale();
		} else if ("en-US".equals(lauage)) {
			locale = Locale.US;
		} else if ("zh-CN".equals(lauage)) {
			locale = Locale.SIMPLIFIED_CHINESE;
		}
		// 其余的不正确的默认就是本地的语言
		else {
			locale = request.getLocale();
		}
		String result = null;
		try {
			result = messageSource.getMessage(code, params, locale);
		} catch (NoSuchMessageException e) {

			LOGGER.error("错误信息是：" + e.getMessage() + "\n");

			LOGGER.error("Cannot find the error message of internationalization, return the original error message.");
		}
		if (result == null) {
			return code;
		}
		return result;
	}

	/**
	 * 设置当前的返回信息
	 * 
	 * @param lauage
	 * @param code
	 * @return
	 */
	public String getMessage(String lauage, String code) {
		// 默认没有就是请求地区的语言
		Locale locale = null;
		if (lauage == null) {
			locale = Locale.CHINA;
		} else if ("en-US".equals(lauage)) {
			locale = Locale.ENGLISH;
		} else if ("zh-CN".equals(lauage)) {
			locale = Locale.CHINA;
		}
		String result = null;
		try {
			if (null != locale && StringUtils.isNotBlank(code)) {
				result = messageSource.getMessage(code, null, locale);
			}
		} catch (NoSuchMessageException e) {
			LOGGER.error("Cannot find the error message of internationalization, return the original error message.");
		}
		if (result == null) {
			return code;
		}
		return result;
	}

	/**
	 * 设置当前的返回信息
	 * 
	 * @param lauage
	 * @param code
	 * @return
	 */
	public String getMessage(String code) {
		Locale locale = Locale.CHINA;
		String result = null;
		try {
			result = messageSource.getMessage(code, null, locale);
		} catch (NoSuchMessageException e) {
			LOGGER.error("Cannot find the error message of internationalization, return the original error message.");
		}
		if (result == null) {
			return code;
		}
		return result;
	}
}
