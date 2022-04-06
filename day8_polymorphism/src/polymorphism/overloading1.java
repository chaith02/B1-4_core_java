package polymorphism;

public class overloading1
{
		void assign(int a,int b)
		{
			System.out.println("Area of Square: "+(a*b));
		}
		void assign(float a,float b)
		{
			System.out.println("Area of Rectangle: "+(float)(a*b));
		}

	public static void main(String[] args) 
	{
		overloading1 o=new overloading1();
		o.assign(5,10);
		o.assign(10f, 20f);

	}
		
}


