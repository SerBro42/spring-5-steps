package com.in28minutes.spring.basics.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.spring_in_5_steps.xml.XMLPersonDAO;

public class SpringIn5StepsXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
				
		try (var applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			LOGGER.info("Beans Loaded -> {}", 
					(Object)applicationContext.getBeanDefinitionNames());
			
			var personDao = 
					applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXMLJdbcConnection());
			
			LOGGER.info("{} {}", personDao, personDao.getXMLJdbcConnection());
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
