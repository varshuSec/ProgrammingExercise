package com.firstspringminiproject.gameproject02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //is managed by spring, candidate for autodetection 
@Primary
public class Mario implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("hole");
	}
	
	public void right() {
		System.out.println("accelerate");
	}
	
	public void left() {
		System.out.println("go back");
	}
}
