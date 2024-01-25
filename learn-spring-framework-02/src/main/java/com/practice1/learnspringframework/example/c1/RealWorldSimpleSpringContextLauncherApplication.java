package com.practice1.learnspringframework.example.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.practice1.learnspringframework.game.example.a1")
@ComponentScan
public class RealWorldSimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		
		try (var context =
		new AnnotationConfigApplicationContext
				(RealWorldSimpleSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			
			
		}
//	
		
		
	}
}
