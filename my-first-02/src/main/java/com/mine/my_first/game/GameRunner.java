package com.mine.my_first.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	//MarioGame game;
	//SuperContraGame game2;
	private GamingConsole game;
	public GameRunner(@Qualifier("contraQualifier") GamingConsole game) {
		this.game = game;
	}
	public void run() {
		
		System.out.println("Running class : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
