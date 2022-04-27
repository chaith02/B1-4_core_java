package Junit_Testing;

import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ex4 
{
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
