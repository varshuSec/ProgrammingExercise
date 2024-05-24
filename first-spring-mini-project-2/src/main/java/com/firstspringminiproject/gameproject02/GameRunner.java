package com.firstspringminiproject.gameproject02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	//dependency injection using construct
	public GameRunner(@Qualifier("pacman") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
