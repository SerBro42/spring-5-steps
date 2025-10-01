package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//The @Primary annotation has been replaced with @Qualifier. Now, in order for this bean to be chosen, we have to specify the correct Qualifier
@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
