package com.geeganage.learnspring;

import com.geeganage.learnspring.game.GameRunner;
import com.geeganage.learnspring.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame=new MarioGame();
		var gameRunner=new GameRunner(marioGame);
		gameRunner.run();

	}

}
