package OOPs;

public class constructor {
	String str;
	int a;
	constructor(String s,int x)
	{
		str=s;
		a=x;
		
	}
	void display()
	{
		System.out.println(str+" "+a);
	}

	public static void main(String[] args) {
		constructor c=new constructor("welcome",11);
		c.display();
		
		

	}

}
