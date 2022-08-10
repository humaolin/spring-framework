package com.hml.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;
/**
 * <p>Bean factory implementations should support the standard bean lifecycle interfaces
 * as far as possible. The full set of initialization methods and their standard order is:
 * <ol>
 * <li>BeanNameAware's {@code setBeanName}
 * <li>BeanClassLoaderAware's {@code setBeanClassLoader}
 * <li>BeanFactoryAware's {@code setBeanFactory}
 * <li>EnvironmentAware's {@code setEnvironment}
 * <li>EmbeddedValueResolverAware's {@code setEmbeddedValueResolver}
 * <li>ResourceLoaderAware's {@code setResourceLoader}
 * (only applicable when running in an application context)
 * <li>ApplicationEventPublisherAware's {@code setApplicationEventPublisher}
 * (only applicable when running in an application context)
 * <li>MessageSourceAware's {@code setMessageSource}
 * (only applicable when running in an application context)
 * <li>ApplicationContextAware's {@code setApplicationContext}
 * (only applicable when running in an application context)
 * <li>ServletContextAware's {@code setServletContext}
 * (only applicable when running in a web application context)
 * <li>{@code postProcessBeforeInitialization} methods of BeanPostProcessors
 * <li>InitializingBean's {@code afterPropertiesSet}
 * <li>a custom init-method definition
 * <li>{@code postProcessAfterInitialization} methods of BeanPostProcessors
 * </ol>
 */
@Slf4j
public class UserService implements BeanNameAware,
		BeanClassLoaderAware,
		BeanFactoryAware,
		EnvironmentAware,
		EmbeddedValueResolverAware,
		ResourceLoaderAware,
		ApplicationEventPublisherAware,
		MessageSourceAware,
		ApplicationContextAware,
		InitializingBean {
	public void test() {
		log.info("init-method");
		System.out.println("hello UserService");
	}

	@Override
	public void setBeanName(String name) {
		log.info("BeanNameAware's setBeanName");
	}
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		log.info("BeanClassLoaderAware's setBeanClassLoader");
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		log.info("BeanFactoryAware's setBeanFactory");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("InitializingBean's afterPropertiesSet");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		log.info("ApplicationContextAware's setApplicationContext");
	}
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		log.info("ApplicationEventPublisherAware's setApplicationEventPublisher");
	}
	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		log.info("EmbeddedValueResolverAware's setEmbeddedValueResolver");
	}
	@Override
	public void setEnvironment(Environment environment) {
		log.info("EnvironmentAware's setEnvironment");
	}
	@Override
	public void setMessageSource(MessageSource messageSource) {
		log.info("MessageSourceAware's setMessageSource");
	}
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		log.info("ResourceLoaderAware's setResourceLoader");
	}
}
