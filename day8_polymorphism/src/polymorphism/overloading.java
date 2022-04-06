package polymorphism;

public class overloading 
{
	void assign(int a)
	{
		System.out.println("Area of Square: "+(a*a));
	}
	void assign(int a,int b)
	{
		System.out.println("Area of Rectangle: "+(a*b));
	}

	public static void main(String[] args) {
		overloading o=new overloading();
		o.assign(5);
		o.assign(10, 20);

	}

}
