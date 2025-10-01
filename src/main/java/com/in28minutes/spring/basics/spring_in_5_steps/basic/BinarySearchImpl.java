package com.in28minutes.spring.basics.spring_in_5_steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm bubbleSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		
		//Search the array
		
		return 42;
	}
	
	//As soon as the dependencies are populated, @PostConstruct is called. Does stuff as soon as the dependencies are available.
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	//This is called just before the bean is removed
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
	
}
