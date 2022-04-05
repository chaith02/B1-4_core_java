package decision;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println("The given number "+a+" is Greater ");
			
		}
		else {
			System.out.println("The given number "+b+" is Greater ");
		}
		s.close();
		
		
		

	}

}
