package com.practice1.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age, Address address) {  };

//Address -firstLine & city
record Address(String firstline, String city) { };
@Configuration
public class HelloWorldJavaConfiguration {

	@Bean
	public String name() {
		return "Gaurav";
	}
	
	@Bean
	public int age() {
		return 20;
		
	}
	@Primary
	@Bean
	public Person person() {
//		var person = new Person("Gaurav", 20, new Address("main Street", "hell"));
//		return person;
		return new Person("Gaurav", 20, new Address("Main Street", "London"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());//name, age
	}
//	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);//name, age
	}
	
//	
//	
//	@Bean
//	@Primary
//	public Person person4Parameters(String name, int age, Address address) {
//		//name , age, Address2
//		return new Person(name, age, address);
//	}
//	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return  new Person (name, age, address);
	}
	
	@Bean(name= "address2")
	@Primary
	public Address address() {
		return new Address ("Baker Street", "London");
		
	}
	
	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
	}
	 
}
