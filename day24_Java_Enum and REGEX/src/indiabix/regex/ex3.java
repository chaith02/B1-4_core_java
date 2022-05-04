package indiabix.regex;

import java.util.regex.Pattern;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I   Love   Bangalore";
		String delimeter="\\s";
		Pattern p=Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		//System.out.println(res);
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
