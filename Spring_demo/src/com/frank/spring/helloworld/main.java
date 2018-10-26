package com.frank.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Helloworld helloworld = (Helloworld) applicationContext.getBean("helloworld");
		helloworld.hello();
	}

}
