package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.spring_in_5_steps.properties.SomeExternalService;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	
	public static void main(String[] args) {
				
		try (var applicationContext = 
				new AnnotationConfigApplicationContext(
						SpringIn5StepsPropertiesApplication.class)) {
			
			var service = 
					applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(service.returnServiceURL());
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
