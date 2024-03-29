package com.practice1.learnspringframework.example.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		
		try (var context =
		new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

		}
	}
}
