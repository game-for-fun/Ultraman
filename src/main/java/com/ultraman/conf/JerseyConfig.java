package com.ultraman.conf;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.slf4j.SLF4JLogger;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.internal.process.Endpoint;
import org.glassfish.jersey.server.spring.SpringComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.util.ClassUtils;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.filter.RequestContextFilter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(RequestContextFilter.class);
		register(Endpoint.class);
		register(JacksonFeature.class);
		register(RequestContextFilter.class);
		register(SLF4JLogger.class);
		register(SpringComponentProvider.class);
		register(ResourceConfig.class);
		// 扫描注册
		registerClasses(findAllClasses());
		// 跨域过滤器注册
		register(CorsFilter.class);
		property(org.glassfish.jersey.server.ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
	}

	/**
	 * 由于spring boot 打包为jar包，jersey packages 无法扫描jar对应的文件夹的文件，故自定义包扫描
	 * 
	 * @return
	 */
	private Set<Class<?>> findAllClasses() {
		String scanPackages = "com.ultraman.*";
		ClassLoader loader = this.getClass().getClassLoader();
		Resource[] resources = new Resource[0];
		try {
			resources = scan(loader, scanPackages);
		} catch (IOException e) {
			log.error("加载class异常", e);
		}
		return convert(loader, resources);
	}

	/**
	 * 扫描 jar 包
	 * 
	 * @param loader
	 * @param packageName
	 * @return
	 * @throws IOException
	 */
	private Resource[] scan(ClassLoader loader, String packageName) throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(loader);
		String pattern = "classpath*:" + ClassUtils.convertClassNameToResourcePath(packageName) + "/**/*.class";
		return resolver.getResources(pattern);
	}

	/**
	 * 加载 class
	 * 
	 * @param loader
	 * @param resource
	 * @return
	 */
	private Class<?> loadClass(ClassLoader loader, Resource resource) {
		try {
			CachingMetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(loader);
			MetadataReader reader = metadataReaderFactory.getMetadataReader(resource);
			return ClassUtils.forName(reader.getClassMetadata().getClassName(), loader);
		} catch (LinkageError | ClassNotFoundException e) {
			if (log.isDebugEnabled()) {
				log.debug("Ignoring candidate class resource " + resource + " due to " + e);
			}
			return null;
		} catch (Throwable e) {
			if (log.isWarnEnabled()) {
				log.warn("Unexpected failure when loading class resource " + resource, e);
			}
			return null;
		}
	}

	/**
	 * resources 转换为 Set<Class>
	 * 
	 * @param loader
	 * @param resources
	 * @return
	 */
	private Set<Class<?>> convert(ClassLoader loader, Resource[] resources) {
		Set<Class<?>> classSet = new HashSet<>(resources.length);
		for (Resource resource : resources) {
			Class<?> clazz = loadClass(loader, resource);
			if (clazz != null) {
				classSet.add(clazz);
			}
		}
		return classSet;
	}

}
