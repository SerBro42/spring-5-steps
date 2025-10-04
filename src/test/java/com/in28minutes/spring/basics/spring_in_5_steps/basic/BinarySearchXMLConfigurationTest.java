package com.in28minutes.spring.basics.spring_in_5_steps.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.in28minutes.spring.basics.spring_in_5_steps.SpringIn5StepsBasicApplication;

//Load the context. The tutorial uses SpringRunner, but it doesn't work. Perhaps it's deprecated? I used SpringExtension instead
@ExtendWith(SpringExtension.class)
//Configuration for the context. For XML, we use "locations" instread of "classes"
@ContextConfiguration(locations="/testContext.xml")
class BinarySearchXMLConfigurationTest {
	
	//Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	void Should_ReturnTrue_InBasicScenario() {
		//call method on binarysearch
		var actualResult = binarySearch.binarySearch(new int[] {}, 5);
		//check if the value is correct
		assertEquals(42, actualResult);
	}

}
