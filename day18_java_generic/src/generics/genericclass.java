package generics;

public class genericclass<T>
{
	T val;
	public void print()
	{
		System.out.println(val.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericclass<Integer>obj=new genericclass<>();
		obj.val=15;
		obj.print();

	}

}
