package com.in28minutes.spring.basics.spring_in_5_steps;


public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;
	
	//sortAlgorithm is a separate dependency that is being injected. sortAlgorithm is an interface, therefore it is being implemented by other classes. 
	//Any of the classes that implement sortAlgorithm can be called upon in the main method
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		
		return 42;
	}

}
