package com.in28minutes.spring.basics.spring_in_5_steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//Here, we're using jakarta.inject annotations. Named instead of Component and Inject instead of Autowired. Spring implements CDI annotations the same way as it does with Spring annotations.
//Which to choose, CDI or Spring annotations? CDI uses Java standards, so some projects may have it as a requirement.
@Named
public class SomeCDIBusiness {
	
	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	public int findGreatest() {
		//We declare the variable 'greatest' and set it to the lowest possible value an integer can adopt
		int greatest = Integer.MIN_VALUE;
		//retrieve the integer array from our injected dependency
		int[] data = someCDIDAO.getData();
		//iterate through all values of the array. If the currently iterated value is greater than 'greatest' 
		//(which starts off as the lowest possible value an integer can have), we change 'greatest' to be equal to 'value'
		for(int value:data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}
