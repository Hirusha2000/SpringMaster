package com.geeganage.learnspring;

import com.geeganage.learnspring.game.GameRunner;
import com.geeganage.learnspring.game.MarioGame;
import com.geeganage.learnspring.game.PacmanGame;
import com.geeganage.learnspring.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game=new MarioGame();
		//var game= new SuperContraGame();
		var game=new PacmanGame();
		
	  var gameRunner= new GameRunner(game);
		
		
		gameRunner.run();

	}

}
