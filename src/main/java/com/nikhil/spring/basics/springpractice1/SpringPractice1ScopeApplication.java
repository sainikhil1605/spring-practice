package com.nikhil.spring.basics.springpractice1;

import com.nikhil.spring.basics.springpractice1.basic.BinarySearchImpl;
import com.nikhil.spring.basics.springpractice1.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringPractice1ScopeApplication {
	private static Logger LOGGER= LoggerFactory.getLogger(SpringPractice1ScopeApplication.class);
	public static void main(String[] args) {


		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringPractice1Application.class);
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2=applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());

	}

}
