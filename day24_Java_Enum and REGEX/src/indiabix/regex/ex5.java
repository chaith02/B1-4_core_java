package indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class ex5 {


	private static String regex="Udupi";
	private static String str="I love Udupi, "+"Udupi is famous for Dosa";
	private static String replace="Bangalore";
	public static void main(String[] args) {
		try
		{
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(str);
			str=m.replaceAll(replace);
			System.out.println(str);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Pattern Syntax Exception: "+e.getDescription());
			System.out.println("Index: "+e.getIndex());
			System.out.println("Message: "+e.getMessage());
		}
	}

}
