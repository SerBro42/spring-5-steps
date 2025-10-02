package com.in28minutes.spring.basics.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.spring_in_5_steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {
		
		// Application context
		
		try (var applicationContext = 
				new AnnotationConfigApplicationContext(
						SpringIn5StepsCdiApplication.class)) {
			// By means of ApplicationContext, we instantiate the bean we need, in this case, BinarySearch
			var cdiBusiness = applicationContext.getBean(SomeCDIBusiness.class);
			

			//Main always gets one instance of personDAO, which always has the same instance of JdbcConnection. Thus, personDAO and JdbcConnection always have the same hash code despite the latter being PROTOTYPE
			LOGGER.info("{} dao-{}", cdiBusiness, cdiBusiness.getSomeCDIDAO());
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
