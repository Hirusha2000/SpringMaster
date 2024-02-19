package com.geeganage.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.geeganage.learnspring.game.GameRunner;
import com.geeganage.learnspring.game.GamingConsole;
import com.geeganage.learnspring.game.PacmanGame;

@Configuration
public class GamingConfiguration {

	
	
	@Bean
	
	public GamingConsole game() {
		var game =new PacmanGame();	
		
		return game;
		
	}
	


	@Bean
	
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner= new GameRunner(game);
		
		return gameRunner;
		
	}
	
	

	
}
