package com.firstspringminiproject.advancedspringconcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//LazyInitialization: initialization is done only when the bean is explicitly, by default all beans are created at spring initialization (Eager initialization)
//Eager initialization is the default and the frequently used form of initialization
//EI throws errors in the beans during startup itself and hence the most preferred, in LI the errors are thrown at runtime
//LI fairs better in terms of memory naturally, however, it is used in beans which are very rarely used.
//Usage: under @Component/@Bean/@Configurable as far as I know, @Lazy under @Confguration does lazy initialization for all the beans defined in the configuration class

@Component
@Lazy(value=true) //indicates lazy initialization
class ClassA{
	public ClassA() {
		System.out.println("ClassA Initialized");
	}
}

@Component
@Lazy(value=false) // or absence of @Lazy annotation indicates eager initialization. By default spring does eager initialization
class ClassB{
	@Autowired
	ClassA classA;
	
	public ClassB() {
		System.out.println("Initialized");
	}
	
	public void printHi() {
		System.out.println("Hi");
	}
}

@ComponentScan
public class LazyInitializationLauncher {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("com.firstspringminiproject.advancedspringconcepts");
		//appContext.getBean(ClassB.class);
		
	}

}
