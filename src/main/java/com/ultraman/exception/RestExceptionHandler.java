package com.ultraman.exception;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.ultraman.constant.MessageCode;
import com.ultraman.i18n.MessageSourceHolder;
import com.ultraman.model.SessionInfo;
import com.ultraman.util.SessionManager;

import lombok.extern.slf4j.Slf4j;

/**
 * @description 统一异常处理类
 * @author gjw
 * @date 2018年6月15日
 */
@Provider
@Slf4j
public class RestExceptionHandler implements ExceptionMapper<Exception> {

	@Autowired
	private MessageSourceHolder messageSourceHolder;

	@Context
	private HttpServletRequest httpServletRequest;

	@Autowired
	private SessionManager sessionManager;

	@Override
	public Response toResponse(Exception exception) {

		exception.printStackTrace();
		log.error(String.format("IP地址是 %s 查询参数是：%s  请求是： %s", httpServletRequest.getRemoteAddr(),
				JSON.toJSONString(httpServletRequest.getParameterMap()) + "", httpServletRequest.getRequestURL()));
		String token = httpServletRequest.getHeader("token");
		log.error(String.format("请求token: %s 请求方式： %s", token, httpServletRequest.getMethod()));
		try {
			SessionInfo session = sessionManager.getObject(token);
			if (null != session) {
				log.error(String.format("操作用户姓名是：%s  用户id是： %s 机构是：%s  角色是：%s ", session.getUserName(),
						session.getUserId(), session.getSchoolId(), session.getRoleList()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 记录异常日志
		ResponseBuilder responseBuilder = null;
		if (exception instanceof ServiceException) {
			responseBuilder = Response.status(Response.Status.OK);
			ServiceException serviceException = (ServiceException) exception;
			String message = messageSourceHolder.getMessage(httpServletRequest, serviceException.getCode(),
					serviceException.getParams());

			log.error(String.format("错误码是：%s  错误信息是： %s", serviceException.getCode(), message));

			responseBuilder.entity(Result.failResult(serviceException.getCode(), message));
		} else {
			responseBuilder = Response.status(Response.Status.INTERNAL_SERVER_ERROR);

			String message = messageSourceHolder.getMessage(httpServletRequest, MessageCode.UNKNOWN_ERROR, null);
			log.error(String.format("错误码是：%s  错误信息是： %s", MessageCode.UNKNOWN_ERROR, message));
			responseBuilder.entity(Result.failResult(MessageCode.UNKNOWN_ERROR, message));
		}

		// 返回的数据类型
		responseBuilder.type(MediaType.APPLICATION_JSON);
		return responseBuilder.build();
	}
}
