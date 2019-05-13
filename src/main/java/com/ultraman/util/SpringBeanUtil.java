package com.ultraman.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring容器工具类
 * 
 * @author 42517
 * @date 2018年12月8日
 */
@Component
public class SpringBeanUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	private static final Object lock = new Object();

	/**
	 * 设置上下文
	 * 
	 * @param applicationContext
	 *            ApplicationContext
	 * @throws BeansException
	 *             BeansException
	 */
	public void setApplicationContext(ApplicationContext applicationContext) {
		synchronized (lock) {
			if (SpringBeanUtil.applicationContext == null) {
				SpringBeanUtil.applicationContext = applicationContext;
			}

		}
	}

	/**
	 * 获取applicationContext
	 * 
	 * @return applicationContext ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 通过name获取 Bean
	 * 
	 * @param name
	 *            String
	 * @return Object Object
	 */
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);
	}

	/**
	 * 通过class获取Bean
	 * 
	 * @param clazz
	 *            Class
	 * @param <T>
	 *            Object
	 * @return bean Object
	 */
	public static <T> T getBean(Class<T> clazz) {
		return getApplicationContext().getBean(clazz);
	}

	/**
	 * 通过name,以及Clazz返回指定的Bean
	 * 
	 * @param name
	 *            String
	 * @param clazz
	 *            Class
	 * @param <T>
	 *            Object
	 * @return <T> Object
	 */
	public static <T> T getBean(String name, Class<T> clazz) {
		return getApplicationContext().getBean(name, clazz);
	}
}
