package com.firstspringminiproject.realworldproblems;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleAppLauncher {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("com.firstspringminiproject.realworldproblems")) {
			appContext.getBean(DataServiceHandler.class);
			appContext.getBean(DataServiceHandler.class).dataService.retrieval().stream().forEach(System.out::println);;
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
