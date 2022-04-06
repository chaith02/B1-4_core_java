package this1;

public class ex2 {
	int a,b;
	void display(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void print()
	{
		System.out.println("value of a: "+a);
		System.out.println("value of a: "+b);
	}

	public static void main(String[] args) {
		ex2 e=new ex2();
		e.display(10, 25);
		e.print();
		

	}

}
