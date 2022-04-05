package abst;

public class ex2 {
	 int a=100;
	void display()
	{
		a=50;
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		ex2 e=new ex2();
		e.display();

	}

}
