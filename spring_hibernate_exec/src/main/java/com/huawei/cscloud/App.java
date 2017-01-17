package com.huawei.cscloud;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huawei.cscloud.component.Singer;

public class App {
	static Logger logger = LogManager.getLogger();
	static {
		System.setProperty("org.jboss.logging.provider", "slf4j");
	}
	public static void main(String[] args) {
		logger.info("set jboss logging provider as slf4j");
		logger.info("program start...");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		Singer singer = (Singer)context.getBean("xxxx");
		singer.sing();
		((AbstractApplicationContext) context).close();
	}
}
