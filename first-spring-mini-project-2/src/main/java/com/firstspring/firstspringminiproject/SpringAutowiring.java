package com.firstspring.firstspringminiproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SpringAutowiring {
	@Autowired
	GoodMorningService gm;
	
	public void printMessage() {
		gm.printMessage();
	}
	
	public static void main(String[] args) {
		SpringAutowiring spring = new SpringAutowiring();
		spring.printMessage();
	}
}

@Component //indicates that the class is going to be depended upon by another class which will be using autowiring  
class GoodMorningService{
	public void printMessage() {
		System.out.println("Good Morning!!");
	}
}