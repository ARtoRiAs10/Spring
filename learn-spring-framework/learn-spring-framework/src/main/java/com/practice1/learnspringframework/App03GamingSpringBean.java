package com.practice1.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice1.learnspringframework.game.GameRunner;
import com.practice1.learnspringframework.game.GamingConsole;
import com.practice1.learnspringframework.game.MarioGame;
import com.practice1.learnspringframework.game.PacManGame;
import com.practice1.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBean {
	public static void main(String[] args) {
		
		try (var context =
		new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
		
//		
////		var game = new MarioGame();
////		var game = new SuperContraGame();
//		var game = new PacManGame();
//		var gameRunner = new GameRunner(game);
//		//2: Object Creation + Wiirng of Dependencies
//		//Game is aDependency of GameRunner
//		
//		gameRunner.run();
//		
	}
}
