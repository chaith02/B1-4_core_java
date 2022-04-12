package Exception;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try
		{
			int res=a/5;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception handling in java");
		}
		s.close();
		
		int res=a/10;
		System.out.println(res);
		s.close();

	}

}
