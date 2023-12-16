package com.nikhil.spring.basics.springpractice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class SpringPractice1Application {

	public static void main(String[] args) {


		ApplicationContext applicationContext=SpringApplication.run(SpringPractice1Application.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		int res=binarySearch.binarySearch(new int[] {1,2,3},2);
		System.out.println(res);
	}

}
