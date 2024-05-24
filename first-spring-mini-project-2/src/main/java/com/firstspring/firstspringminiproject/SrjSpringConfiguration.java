package com.firstspring.firstspringminiproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age) {} // record was introduced in JDK 16 to reduce the verbosity while creating spring beans,
										// Typically a record creates a public getters and setters and constructors.

@Configuration
public class SrjSpringConfiguration {

	@Bean
	@Primary // to be used while auto-wiring, tells the compiler that this is the default value of the particular bean type if multiple  are present.
	public String name() {
		return "Kichha";
	}
	
	@Bean
	@Qualifier("vihu-name") //alternate form of autowiring using the qualifier annotation
	public String name2() {
		return "Vihu";
	}
	
	@Bean
	public Person person2() {
		return new Person("Kichha", Integer.MAX_VALUE);
	}
	
	@Bean //without this annotation the bean is not recognised
	public Person personWithParameters() {
		return new Person(name(), Integer.MAX_VALUE);
	}
	
	@Bean
	public Person personWithAutowiring(String name) {
		return new Person(name, Integer.MAX_VALUE);
	}
	
	@Bean
	public Person personWithQualifier(@Qualifier("vihu-name") String name) {
		return new Person(name, Integer.MAX_VALUE);
	}
	
	@Bean
	public Person personWithAutowiringUsingVarName(String name2) {
		return new Person(name2, Integer.MAX_VALUE);
	}
	
}
