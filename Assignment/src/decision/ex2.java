package decision;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b & a>c) {
			System.out.println("The given number "+a+" is Greater ");
			
		}
		else if(b>a & b>c) {
			System.out.println("The given number "+b+" is Greater ");
		}
		else {
			System.out.println("The given number "+c+ " is Greater");
		}
		s.close();
		

	}

}
