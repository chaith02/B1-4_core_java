package looping;

import java.util.Scanner;

public class Printing_pattern {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int r=s.nextInt();
	
		System.out.println("By using for loop:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("@  ");
			}
			System.out.println();
		}
		s.close();
	
		

	}

}
