package com.firstspringminiproject.gameproject;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunGame {
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			appContext.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
