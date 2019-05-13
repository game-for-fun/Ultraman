package com.ultraman.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@PropertySource("classpath:i18n.properties")
public class I18nConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(I18nConfig.class);

	@Value("${spring.messages.basename}")
	private String basename;

	@Value("${spring.messages.cache-seconds}")
	private long cacheMillis;

	@Value("${spring.messages.encoding}")
	private String encoding;

	@Value("${spring.messages.fallbackToSystemLocale}")
	private boolean fallbackToSystemLocale;

	public MessageSource initMessageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		LOGGER.info("baseName====>:" + this.basename);
		messageSource.setBasename(basename);
		messageSource.setDefaultEncoding(encoding);
		messageSource.setCacheMillis(cacheMillis);
		messageSource.setFallbackToSystemLocale(fallbackToSystemLocale);
		return messageSource;
	}
}
