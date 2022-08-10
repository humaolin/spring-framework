package com.hml;

import com.hml.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.test();
        //		final AppConfig bean = context.getBean(AppConfig.class);
        //		System.out.println(bean);
        //		AnnotationConfigApplicationContext context = new
        // AnnotationConfigApplicationContext(AppConfig.class);
        //		//ClassPathXmlApplicationContext context = new
        // ClassPathXmlApplicationContext("spring.xml");
        //		UserService userService = (UserService) context.getBean("userService");
        //		userService.test();
        //		final AppConfig bean = context.getBean(AppConfig.class);
        //		System.out.println(bean);
    }
}
