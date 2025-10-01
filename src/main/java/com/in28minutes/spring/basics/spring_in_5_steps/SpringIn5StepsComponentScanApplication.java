package com.in28minutes.spring.basics.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.spring_in_5_steps.scope.PersonDAO;

//@SpringBootApplication defines a component scan only in the package where it is located.
//@ComponentScan defines a component scan in the specified package directory, in this case, a completely separate package.
@SpringBootApplication
@ComponentScan("package com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		
		// Application context
		var applicationContext = 
				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
	
		// By means of ApplicationContext, we instantiate the bean we need, in this case, BinarySearch
		var componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);

	}

}
