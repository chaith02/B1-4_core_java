package Junit_Testing;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ex8 {
	@BeforeAll   
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
