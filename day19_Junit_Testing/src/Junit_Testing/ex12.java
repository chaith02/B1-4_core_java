package Junit_Testing;


import org.junit.jupiter.api.Assumptions;

public class ex12 {
	void accept()
	{
		System.setProperty("1", "chaithra");
		Assumptions.assumeTrue("chaithra".equals(System.getProperty("1")));
	}
		void accept1()
		{
			System.setProperty("2", "shushma");
			Assumptions.assumeFalse("shushma".equals(System.getProperty("2")));
			
			 
		}

}
