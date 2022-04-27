package Junit_Testing;

import org.junit.jupiter.api.Assumptions;

public class ex10 {
	void accept()
	{
		System.setProperty("1", "chaithra");
		Assumptions.assumeTrue("chaithra".equals(System.getProperty("2")));
		
		 
	}

}
