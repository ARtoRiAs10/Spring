package com.practice1.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.practice1.learnspringframework.game")
public class App03GamingSpringBean {
	
//	@Bean
//	public GamingConsole game() {
//		var game = new PacManGame();
//		return game;
//	}

	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Game:" + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	
	public static void main(String[] args) {
		
		try (var context =
		new AnnotationConfigApplicationContext
				(App03GamingSpringBean.class)){
			
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}
}
