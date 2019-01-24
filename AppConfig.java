package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.service.SubjectBookService;

@Configuration
@ComponentScan("com.demo")
/* Java based configuration file */
public class AppConfig {

	@Bean(name="subjectBookService")
	@Scope("prototype")
	public SubjectBookService subjectBookService() {
		return new SubjectBookService();
	}

}

