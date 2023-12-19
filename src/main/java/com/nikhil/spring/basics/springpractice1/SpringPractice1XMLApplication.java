package com.nikhil.spring.basics.springpractice1;

import com.nikhil.spring.basics.springpractice1.scope.PersonDAO;
import com.nikhil.spring.basics.springpractice1.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan
public class SpringPractice1XMLApplication {
	private static Logger LOGGER= LoggerFactory.getLogger(SpringPractice1XMLApplication.class);
	public static void main(String[] args) {


		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		XMLPersonDAO personDAO=applicationContext.getBean(XMLPersonDAO.class);
		LOGGER.info("{}",(Object) applicationContext.getBeanDefinitionNames());
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());


	}

}
