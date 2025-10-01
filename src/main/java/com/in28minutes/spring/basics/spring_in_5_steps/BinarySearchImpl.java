package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//With the annotation "Component", we're indicating that it is a Bean
//We added a @Scope annotation with prototype. Now, every new instance of this bean will be unique
@Component
@Scope("prototype")
public class BinarySearchImpl {

	//With the annotation "autowired" we're indicationg that it is a dependency
	//We have two dependencies with @Qualifier. To choose which one to use, we put here the qualifier name of our desired bean. Qualifier takes precedence over autowiring by name.
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm bubbleSortAlgorithm;
	
	//If you have mandatory dependencies, the recommendation is to use constructor injections. For all others, use setter injection

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		
		//Search the array
		
		return 42;
	}

}
