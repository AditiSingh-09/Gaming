package com.mine.my_first.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("Move UP");
	}
	public void down() {
		System.out.println("Move Down");
		
	}
	public void right() {
		System.out.println("eat");
	}
	
	public void left() {
		System.out.println("Move left");
	}
}
