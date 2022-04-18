package Strings;
import java.util.StringTokenizer;
public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st3=new StringTokenizer("JAVA:Code:String", ":",true);
		while(st3.hasMoreTokens()) 
			System.out.println(st3.nextToken());

	}

}
