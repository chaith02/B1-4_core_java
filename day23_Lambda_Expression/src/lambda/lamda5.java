package lambda;

interface C
{
	String print(String message);
}

public class lamda5 {
	public static void main(String[] args) 
	{
		C obj=(String message)->
		{
			return message;
			//System.out.println("The Name is: "+message);
		};
		System.out.println("The Name is: "+obj.print("chaithra"));
	}

}
