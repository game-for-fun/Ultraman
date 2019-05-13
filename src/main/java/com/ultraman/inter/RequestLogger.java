package com.ultraman.inter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * for 访问权限Token校验拦截处理类
 * @author Administrator
 */
@Aspect
@Component
public class RequestLogger {

	/** 拦截对象范围 */
	private static final String EXECUTION = "execution(* com.ultraman..service.*.*(..))";

	/** 日志 */
	private static final Logger logger = LoggerFactory.getLogger(RequestLogger.class.getName());

	@Around(EXECUTION)
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		// 调用方法的参数
		Object[] args = joinPoint.getArgs();
		// 调用的方法名
		String method = joinPoint.getSignature().getName();
		// 获取目标对象的类名
		String className = joinPoint.getTarget().getClass().getName();
		logger.info("▼▼▼ execute begin >> class：" + className + " method：" + method);
		long startTime = System.currentTimeMillis();

		// 拦截对象处理调用
		Object result = joinPoint.proceed(args);
		long endTime = System.currentTimeMillis();
		logger.info("▲▲▲ execute end   >> class：" + className + " method：" + method);
		logger.info("当前方法 " + method + " 执行时间：" + (endTime - startTime) + "ms");
		return result;
	}

	@AfterThrowing(throwing = "ex", pointcut = EXECUTION)
	public void doRecoverActions(Throwable ex) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try {
			ex.printStackTrace(pw);
			logger.error(sw.toString());
			pw.close();
			sw.close();
		} catch (IOException ioe) {
			logger.error(ioe.getMessage());
		}
	}
}
