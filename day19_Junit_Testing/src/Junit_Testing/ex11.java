package Junit_Testing;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Assumptions;


public class ex11 {
	void accept()
	{
		System.setProperty("1", "chaithra");
		Assertions.assertFalse("chaithra".equals(System.getProperty("2")));
		
		 
	}

}
