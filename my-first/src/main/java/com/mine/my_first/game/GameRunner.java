package com.mine.my_first.game;

public class GameRunner {
	//MarioGame game;
	//SuperContraGame game2;
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
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
