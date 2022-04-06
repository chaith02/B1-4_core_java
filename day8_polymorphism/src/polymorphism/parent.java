package polymorphism;

class base
{
	void method1()
	{
		System.out.println("parent1");
	}

}
class derived extends base
{
	void method1()
	{
		System.out.println("child1");
	}
}
class parent
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base b=new base();
		b.method1();
		derived d=new derived();
		d.method1();

	}

}
