package com.firstspringminiproject.gameproject;

public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
