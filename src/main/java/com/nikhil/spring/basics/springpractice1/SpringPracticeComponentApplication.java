package com.nikhil.spring.basics.springpractice1;

import com.nikhil.spring.basics.componentscan.ComponentDAO;

import com.nikhil.spring.basics.springpractice1.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// By default this is not scanned
@ComponentScan("com.nikhil.spring.basics")
@Configuration
public class SpringPracticeComponentApplication {
	private static Logger LOGGER= LoggerFactory.getLogger(SpringPracticeComponentApplication.class);
	public static void main(String[] args) {


		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringPractice1Application.class);
		ComponentDAO personDAO=applicationContext.getBean(ComponentDAO.class);
		ComponentDAO personDAO2=applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());

	}

}
