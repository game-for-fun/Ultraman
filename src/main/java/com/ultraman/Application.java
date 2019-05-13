package com.ultraman;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ultraman.filter.ConfigFilter;

/**
 * @author
 *
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableConfigurationProperties
@ComponentScan(basePackages = { "com.ultraman" }, excludeFilters = @Filter(type = FilterType.REGEX, pattern = {
		"com.ultraman.*.config.*" }), includeFilters = @Filter(type = FilterType.CUSTOM, classes = {
				ConfigFilter.class }))
//@EnableJms
//@EnableDubbo(scanBasePackages= {"com.de"})
@EnableScheduling
@ServletComponentScan
@EnableRabbit
public class Application {

	@PostConstruct
	public void initTimeZone() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
