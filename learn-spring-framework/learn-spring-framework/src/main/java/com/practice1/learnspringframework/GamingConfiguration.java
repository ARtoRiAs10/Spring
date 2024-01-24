package com.practice1.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice1.learnspringframework.game.GameRunner;
import com.practice1.learnspringframework.game.GamingConsole;
import com.practice1.learnspringframework.game.PacManGame;


@Configuration
public class GamingConfiguration {

	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
//	
////	var game = new MarioGame();
////	var game = new SuperContraGame();
//	var game = new PacManGame();
//	var gameRunner = new GameRunner(game);
//	//2: Object Creation + Wiirng of Dependencies
//	//Game is aDependency of GameRunner
//	
//	gameRunner.run();
	
}
