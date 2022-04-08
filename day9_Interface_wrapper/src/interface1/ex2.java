package interface1;

public interface ex2 
{
	void display();
    void print();

}

class Main1 implements ex2
{
	public void display()
	{
		System.out.println("Hi chaithra");
	}
	public void print()
	{
		System.out.println("Hi shushma");
	}
	public static void main(String args[])
	{
		Main1 m=new Main1();
		m.display();
		m.print();
		
	}
}
   