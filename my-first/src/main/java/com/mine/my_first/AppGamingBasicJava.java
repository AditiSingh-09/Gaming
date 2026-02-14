package com.mine.my_first;

import com.mine.my_first.game.GameRunner;
import com.mine.my_first.game.MarioGame;
import com.mine.my_first.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
