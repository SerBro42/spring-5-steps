package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//There are two competing beans: BubbleSort and QuickSort, both having @Component. The annotation @Primary is used 
//to indicate that this one will be used, unless otherwise stated.
@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
