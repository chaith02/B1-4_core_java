package Junit_Testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ex3 
{
	@Disabled
	@Test
	void print()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	
	@Test
	void print1()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	

}



