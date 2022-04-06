package this1;

public class ex3 {
	void print(ex3 e)
	{
		System.out.println("SSP Developer");
	}
	void display()
	{
		print(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3 e=new ex3();
		e.display();

	}

}
