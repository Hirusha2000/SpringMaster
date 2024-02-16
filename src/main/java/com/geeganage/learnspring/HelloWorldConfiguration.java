package com.geeganage.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name, int age) {};

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
		return new Person("udara",26);
		
		
	}
	
	
	@Bean
	public Address address () {
		return new Address("Meegoda","Galle");
		
		
	}
	

}
