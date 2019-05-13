package com.ultraman.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description 配置文件读取工具
 * @author gjw
 * @date 2018年6月15日
 */
public class MsgConfigReaderUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(MsgConfigReaderUtil.class);

	private static Properties prop = new Properties();
	private static InputStreamReader inputStream = null;

	private MsgConfigReaderUtil() {

	}

	static {
		try {
			prop = new Properties();
			// 读取配置文件 指定字符编码UTF-8,防止出现中文乱码
			inputStream = new InputStreamReader(MsgConfigReaderUtil.class.getClassLoader().getResourceAsStream(
					"i18n/exception/exception_zh_CN.properties"), StandardCharsets.UTF_8.toString());
			prop.load(inputStream);
		} catch (FileNotFoundException e) {
			LOGGER.error("### FileNotFoundException ###" + e.getMessage());
		} catch (IOException ioe) {
			LOGGER.error("### IOException ###" + ioe.getMessage());
		}
	}

	/**
	 * 获取属性值
	 * 
	 * @param key
	 * @return
	 */
	public static String getValue(String key) {
		return prop.getProperty(key);
	}
}
