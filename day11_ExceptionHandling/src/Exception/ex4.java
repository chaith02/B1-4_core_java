package Exception;

public class ex4 {
	static void display(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("you are elligible to donate the blood");
		}
		else
		{
			throw new ArithmeticException("not eligible");
			
		}
	}

	public static void main(String[] args) 
	{
		display(16,55);
		System.out.println("Exception handled");

	}

}
