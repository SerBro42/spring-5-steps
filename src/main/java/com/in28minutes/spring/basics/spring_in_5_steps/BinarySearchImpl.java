package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//With the annotation "Component", we're indicating that it is a Bean
@Component
public class BinarySearchImpl {

	//With the annotation "autowired" we're indicationg that it is a dependency
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	//If you have mandatory dependencies, the recommendation is to use constructor injections. For all others, use setter injection

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		
		return 42;
	}

}
