package com.nikhil.spring.basics.springpractice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPractice1Application {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
		int res=binarySearch.binarySearch(new int[] {1,2,3},2);
		System.out.println(res);
		SpringApplication.run(SpringPractice1Application.class, args);
	}

}
