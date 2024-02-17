package com.geeganage.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.geeganage.learnspring.game.GameRunner;
import com.geeganage.learnspring.game.MarioGame;
import com.geeganage.learnspring.game.PacmanGame;
import com.geeganage.learnspring.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
	
		var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
		//System.out.println(context.getBean(Address.class));
		
		}
}
