package com.firstspringminiproject.gameproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole gamingConsole() {
		return new Mario();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole gamingConsole) {
		return new GameRunner(gamingConsole);
	}
}
