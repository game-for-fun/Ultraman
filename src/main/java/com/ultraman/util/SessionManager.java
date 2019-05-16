package com.ultraman.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ultraman.constant.MessageCode;
import com.ultraman.exception.ServiceException;
import com.ultraman.model.SessionInfo;

/**
 * 会话管理类
 * @author cr
 *
 */
@Component
public class SessionManager {

	@Autowired
	private RedisUtil redis;

	private static final Logger LOGGER = LoggerFactory.getLogger(SessionManager.class);

	private static final Integer REDIS_FOREVER_TIME = -1;

	private static final Integer MAP_INIT_LENGTH = 16;

	/**
	 * 设置会话信息
	 * 
	 * @param token
	 *            type of String
	 * @param sessionJsonStr
	 *            type of String
	 * @param time
	 *            type of Lonng
	 * @throws Exception
	 *             type of Exception
	 */
	public void setObject(String token, String sessionJsonStr, Long time) throws Exception {
		redis.set(token, sessionJsonStr, time);
	}

	/**
	 * 获取会话信息
	 * 
	 * @param token
	 *            type of String
	 * @return session ype of SessionInfo
	 * @throws Exception
	 *             type of Exception
	 */
	public SessionInfo getObject(String token) throws Exception {
		SessionInfo session = null;
		// 根据token获取redis中会话信息
		// TODO
//		if (StringUtils.isBlank(token)) {
//			throw new ServiceException("前端传递的token为空");
//		} else {
//			String sessionJsonStr = (String) redis.get(token);
//			LOGGER.warn("### token value is : " + sessionJsonStr + "###");
//			if (null == sessionJsonStr) {
//				LOGGER.warn("### token is : " + token + "###");
//				throw new ServiceException(MessageCode.USER_LOGIN_INFO_IS_EXPIRE);
//			} else {
//				JSONObject json = null;
//				try {
//					json = JSON.parseObject(sessionJsonStr);
//				} catch (Exception e) {
//					LOGGER.warn("### session转换错误");
//				}
//				if (null != json) {
//					session = JSONObject.toJavaObject(json, SessionInfo.class);
//				}
//			}
//		}
		return session;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public Object getValue(String key) {
		return redis.get(key);
	}

	/**
	 * 删除记录
	 * 
	 * @param key
	 *            type of String
	 */
	public void remove(String key) {
		redis.del(key);
	}

	/**
	 * 根据角色获取权限列表
	 * 
	 * @param role
	 *            type of String
	 * @return returnMap type of HashMap
	 */
	public Map<String, Object> getPermissionByRole(String role) {
		Map<String, Object> returnMap = new HashMap<>(MAP_INIT_LENGTH);
		String key = "RolePermission:" + role;
		List<Object> permissionList = redis.lGet(key, 0, REDIS_FOREVER_TIME);

		for (Object permissionId : permissionList) {
			LOGGER.warn("To be continue..." + permissionId);
		}

		return returnMap;
	}
}
