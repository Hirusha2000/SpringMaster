package com.geeganage.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.geeganage.learnspring.game.GameRunner;
import com.geeganage.learnspring.game.GamingConsole;
import com.geeganage.learnspring.game.MarioGame;
import com.geeganage.learnspring.game.PacmanGame;
import com.geeganage.learnspring.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		
		try (var context =new AnnotationConfigApplicationContext(GamingConfiguration.class);
				){
			
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
			
		
	}

}
