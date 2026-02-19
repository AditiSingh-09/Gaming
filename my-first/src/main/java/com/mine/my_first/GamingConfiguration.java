package com.mine.my_first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mine.my_first.game.GameRunner;
import com.mine.my_first.game.GamingConsole;
import com.mine.my_first.game.PacMan;

@Configuration
public class GamingConfiguration {
	
	
	@Bean
	public GamingConsole game() {
		var game = new PacMan();
		return game;
	};
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	};
	
	
	
	// TODO Auto-generated method stub
	//var game = new MarioGame();
//	var game = new PacMan(); //1: Object Creation
//	var gameRunner = new GameRunner(game); 
//	//2: Object Creation + Wiring of Dependencies
//	// Game is a Dependency of GameRunner
//	gameRunner.run();

	
	
}
