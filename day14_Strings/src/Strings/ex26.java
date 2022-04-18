package Strings;
import java.util.StringTokenizer;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Lets,s,try,this",",");
		while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());

	}
	}

}
