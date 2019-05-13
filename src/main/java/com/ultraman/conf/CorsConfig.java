package com.ultraman.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 
 * @author cr
 *
 */
@Configuration
public class CorsConfig {
	private CorsConfiguration buildConfig() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();

		/**
		 * 允许任何域名使用
		 */
		corsConfiguration.addAllowedOrigin("*");

		/**
		 * 允许任何头
		 */
		corsConfiguration.addAllowedHeader("*");

		/**
		 * 是否允许证书 不再默认开启
		 */
		corsConfiguration.setAllowCredentials(true);

		/**
		 * 允许任何方法（post、get等）
		 */
		List<String> methodList = new ArrayList<String>(5);
		methodList.add("GET");
		methodList.add("POST");
		methodList.add("PUT");
		methodList.add("DELETE");
		methodList.add("OPTIONS");
		corsConfiguration.setAllowedMethods(methodList);

		/**
		 * 跨域允许时间
		 */
		corsConfiguration.setMaxAge(3600L);
		return corsConfiguration;
	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		/**
		 * 对接口配置跨域设置
		 */
		source.registerCorsConfiguration("/**", buildConfig());
		return new CorsFilter(source);
	}

}
