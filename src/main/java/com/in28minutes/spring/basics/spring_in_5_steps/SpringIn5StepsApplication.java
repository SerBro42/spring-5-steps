package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		// BinarySearch depends on the sort algorithm that is being passed
		// In this case, QuickSortAlgorithm is being implemented
		// We will learn more about "loose coupling" in the next tutorial 
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		
		System.out.println(result);
		
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
