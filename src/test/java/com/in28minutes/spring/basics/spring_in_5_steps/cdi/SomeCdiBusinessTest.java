package com.in28minutes.spring.basics.spring_in_5_steps.cdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

//The course uses RunWith, but that is JUnit4. I use JUnit5, so I use ExtendWith instead
@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {
	
	//Inject Mock
	@InjectMocks
	SomeCDIBusiness business;
	
	//Create Mock
	@Mock
	SomeCDIDAO daoMock;

	@Test
	void Should_ReturnTrue_InBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		
		assertEquals(4, business.findGreatest());
	}

}
