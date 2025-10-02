package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;

//In order to change from Spring Boot to Spring Core, we put @Configuration annotation, and scan for packages explicitly (Spring Boot does that by default)
@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {
	
	//What are the beans? -> @Component
	//What are the dependencies? -> @Autowired
	//Where to search for beans? -> The annotation @SpringBootApplication scans the package and subpackages where the Main file is located

	public static void main(String[] args) {
		
		// Application context
		var applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
	
		// By means of ApplicationContext, we instantiate the bean we need, in this case, BinarySearch
		var binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		var binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		//Both beans are different, they have different hashcodes. They are PROTOTYPE
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		
		System.out.println(result);
	}

}
