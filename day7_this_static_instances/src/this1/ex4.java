package this1;

public class ex4 {
	String str;
	ex4()
	{
		str="chaithra";
	}
	ex4 get()
	{
		return this;
	}
	void display()
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex4 c=new ex4();
		c.get().display();

	}

}
