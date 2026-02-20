package com.mine.my_first;

import com.mine.my_first.game.GameRunner;
import com.mine.my_first.game.MarioGame;
import com.mine.my_first.game.SuperContraGame;
import com.mine.my_first.game.PacMan;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		var game = new PacMan(); //1: Object Creation
		var gameRunner = new GameRunner(game); 
		//2: Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		gameRunner.run();

	}

}
