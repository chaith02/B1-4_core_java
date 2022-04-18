package Strings;
import java.util.StringTokenizer;
public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st3=new StringTokenizer("JAVA:Code:String", ":",false);
		while(st3.hasMoreTokens()) 
			System.out.println(st3.nextToken());


	}

}
