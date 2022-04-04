package Inheritance;

class Parent
{
	void print()
	{
		System.out.println("Hello,This is chaithra");
	}
}
class child extends Parent
{
	void display()
	{
		System.out.println("SingleInheritance");
		
	}
}
class SingleInheritance
{
	public static void main(String[] args) 
	{
		child c=new child();
		c.display();
		c.print();
		
		
	}

}
