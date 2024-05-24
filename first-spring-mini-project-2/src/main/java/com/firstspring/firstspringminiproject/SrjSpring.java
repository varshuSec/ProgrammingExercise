package com.firstspring.firstspringminiproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SrjSpring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch a Spring Context
		
		var appContext = new AnnotationConfigApplicationContext(SrjSpringConfiguration.class);
		
		//Configure the things that we want spring to manage
		
		System.out.println(appContext.getBean("name"));
		System.out.println(appContext.getBean("person2"));
		System.out.println(appContext.getBean("name2")); //one with @primary annotation is printed
		System.out.println(appContext.getBean("personWithQualifier")); //one with @Qualifier is printed	
	}

}
