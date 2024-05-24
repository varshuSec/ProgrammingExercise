package com.firstspringminiproject.dependencyinjection;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionLauncher {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("com.firstspringminiproject.dependencyinjection")) {
			System.out.println(appContext.getBean(BusinessClass.class).toString());
		} catch (BeansException e) {
			e.printStackTrace();
		}	
	}
}