package com.practice1.learnspringframework;

import com.practice1.learnspringframework.game.GameRunner;
import com.practice1.learnspringframework.game.MarioGame;
import com.practice1.learnspringframework.game.PacManGame;
import com.practice1.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		//2: Object Creation + Wiirng of Dependencies
		//Game is aDependency of GameRunner
		
		gameRunner.run();
		
	}
}
