package Junit_Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class ex5 {
	@Test
	void accept()
	{
		System.setProperty("1", "chaithra");
		Assumptions.assumeFalse("chaithra".equals(System.getProperty("2")));
		
		 
	}

}
