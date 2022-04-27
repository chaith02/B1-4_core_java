package Junit_Testing;

import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ex9 {
	@AfterAll   
	static void display()
	{
		System.out.println("chaithra");
	}
	@Test
	void display1()
	{
		System.out.println("shushma");
	}
	

}
