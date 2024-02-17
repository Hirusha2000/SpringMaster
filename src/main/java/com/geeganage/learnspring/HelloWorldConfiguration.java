package com.geeganage.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name, int age ,Address address) {};

record Address(String firstLine, String city) {};
@Configuration

public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Hirusha";
	}
	
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person () {
		return new Person("udara",26, new Address("Pragathi mawatha","Galle"));
		
		
	}
	
	@Bean
	public Person person2MethodCall () {
		return new Person(name(),age(),address());
		
		
	}
	
	
	@Bean
	public Person person3Parameters (String name , int age , Address address3) {
		return new Person(name,age,address3);
		
		
	}
	
	@Bean(name="address2")
	public Address address () {
		return new Address("Meegoda","Galle");
		
		
	}
	
	
	@Bean(name="address3")
	public Address address3 () {
		return new Address("Pilana","Galle");
		
		
	}
	

}
