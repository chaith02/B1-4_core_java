package Exception;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"abc","123",null,"xyz"};
		for(int i=0;i<5;i++)
{
	try
	{
		@SuppressWarnings("unused")
		int a=s[i].length()+Integer.parseInt(s[i]);
	}
	catch(NumberFormatException |NullPointerException |ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Handles above mentioned three Exception");
	}
}

	}

}
