package com.practice1.learnspringframework.example.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All  dependencies are ready");
	}
	
	@PostConstruct
	public void initilize() {
			someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
	
}


@Component
class SomeDependency {
	
	
	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
}

@Configuration
//@ComponentScan("com.practice1.learnspringframework.game.example.a1")
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

	public static void main(String[] args) {
		
		try (var context =
		new AnnotationConfigApplicationContext
				(PrePostAnnotationsContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
//	
		
		
	}
}
