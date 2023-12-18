package com.nikhil.spring.basics.springpractice1;

import com.nikhil.spring.basics.springpractice1.basic.BinarySearchImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class SpringPractice1Application {

	public static void main(String[] args) {


		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringPractice1Application.class);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		int res=binarySearch.binarySearch(new int[] {1,2,3},2);
		System.out.println(res);
	}

}
