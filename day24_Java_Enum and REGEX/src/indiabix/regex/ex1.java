package indiabix.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="chaithra";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		boolean Result=Pattern.matches(pattern,  input);
		System.out.println(Result);

	}

}
