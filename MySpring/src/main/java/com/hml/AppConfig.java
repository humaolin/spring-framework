package com.hml;

import com.hml.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.hml")
public class AppConfig {
//	@Bean
	public UserService userService() {
		return new UserService();
	}
}
