package lambda;

interface A
{
	void show();
	
}
/*class xyz implements A
{
	public void show()
	{
		System.out.println("Welcome to lambda Expression");
	}
}*/
public class Lambda1 {

	public static void main(String[] args) 
	{
		A obj=()->
		{
			System.out.println("Welcome to lambda Expression");
		};
		obj.show();

	}

}
