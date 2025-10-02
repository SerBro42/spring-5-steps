package com.in28minutes.spring.basics.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.spring_in_5_steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		
		// Application context
		var applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
	
		// By means of ApplicationContext, we instantiate the bean we need, in this case, BinarySearch
		var personDAO = applicationContext.getBean(PersonDAO.class);
		
		var personDAO2 = applicationContext.getBean(PersonDAO.class);

		//Main always gets one instance of personDAO, which always has the same instance of JdbcConnection. Thus, personDAO and JdbcConnection always have the same hash code despite the latter being PROTOTYPE
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}

}
