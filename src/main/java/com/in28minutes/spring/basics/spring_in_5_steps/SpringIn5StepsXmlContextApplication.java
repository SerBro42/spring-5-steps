package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.spring_in_5_steps.xml.XMLPersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsXmlContextApplication {

	public static void main(String[] args) {
				
		try (var applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			var personDao = 
					applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXMLJdbcConnection());
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
