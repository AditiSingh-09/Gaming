package com.mine.my_first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mine.my_first.game.GameRunner;
import com.mine.my_first.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			//context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}

}
