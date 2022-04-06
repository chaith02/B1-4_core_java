package instance;

public class ex3 {
	class Child extends ex3 {
		class Main

		{

		public void main(String[] args)

		{

		Child cobj = new Child();

		if (cobj instanceof Child)

		System.out.println("cobj is instance of Child");

		else

		System.out.println("cobj is NOT instance of Child");

		// instanceof returns true for Parent class also

		if (cobj instanceof ex3)

		System.out.println("cobj is instance of Parent");

		else

		System.out.println("cobj is NOT instance of Parent");

		}

		}
		}
	}