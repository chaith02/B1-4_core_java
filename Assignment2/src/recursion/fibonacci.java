package recursion;

import java.util.Scanner;

public class fibonacci {
	static int fibonacci(int n) {
		{
			if(n==0||n==1) {
				return n;
			}
			else
			{
				return fibonacci(n-2)+fibonacci(n-1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci obj=new fibonacci();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		for(int i=0;i<x;i++)
			System.out.print(obj.fibonacci(i)+",");
		s.close();

	}

}
