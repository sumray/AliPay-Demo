package com.zq.bookstorepay.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.zq.bookstorepay.pojo.AlipayProperties;

@Configuration
public class PropertyListener implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent sce) {
		AlipayProperties.loadProperties();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("销毁");
	}

}
