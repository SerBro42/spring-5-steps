package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	//What are the beans? -> @Component
	//What are the dependencies? -> @Autowired
	//Where to search for beans? -> The annotation @SpringBootApplication scans the package and subpackages where the Main file is located

	public static void main(String[] args) {
		
		// Application context
		var applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
	
		// By means of ApplicationContext, we instantiate the bean we need, in this case, BinarySearch
		var binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		
		System.out.println(result);
	}

}
