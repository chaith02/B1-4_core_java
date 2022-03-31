package OOPs;

public class car1 
{
	String str;
	car1(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("This is "+str);
	}

	public static void main(String[] args)
	{
		car1 a=new car1("Audi");
		car1 c=new car1("Benze");
		car1 b=new car1("BMW");
		a.print();
		c.print();
		b.print();
		
		

	}

}
