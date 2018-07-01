package com.spring.intro.Spring5Intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5IntroApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appContext = SpringApplication.run(Spring5IntroApplication.class, args);
		BinarySearchImpl binarySearchImpl = appContext.getBean(BinarySearchImpl.class);
		int pos = binarySearchImpl.BinarySearch(new int[] {1,  2, 3, 4}, 3);
		System.out.println(pos);
	}
}
