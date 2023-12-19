package com.nikhil.spring.basics.springpractice1;

import com.nikhil.spring.basics.springpractice1.basic.BinarySearchImpl;
import com.nikhil.spring.basics.springpractice1.properties.SomeExternalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPractice1PropertiesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringPractice1PropertiesApplication.class);
		SomeExternalService service=applicationContext.getBean(SomeExternalService.class);
//		int res=s.binarySearch(new int[] {1,2,3},2);
		System.out.println(service.returnServiceURL());
	}

}
