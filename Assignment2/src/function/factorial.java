package function;

import java.util.Scanner;

public class factorial {
	public static int factorial(int n)
	{
		int fact=n;
		for(int i=1;i<n;i++)
		{
			fact=i*fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));
		s.close();

	}

}
