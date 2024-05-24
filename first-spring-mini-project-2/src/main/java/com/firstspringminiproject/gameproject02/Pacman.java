package com.firstspringminiproject.gameproject02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("pacman") - A qualifier neednt always be put, incase qualifier is absent then we can use the class name with the first letter in lower case
public class Pacman implements GamingConsole{
	
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("down");
	}
	
	public void right() {
		System.out.println("right");
	}
	
	public void left() {
		System.out.println("left");
	}

}
