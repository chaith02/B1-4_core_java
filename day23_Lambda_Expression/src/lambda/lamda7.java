package lambda;

public class lamda7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thraed example without lambda Expression
		/*Runnable R1=new Runnable()
				{
			@Override
			public void run() 
			{
				System.out.println("Class Name is: Lambda7");
				
			}
				};
				Thread t=new Thread(R1);
				t.start();*/
		//thread example using lambda expression
		
		Runnable r1=()->
		{
			System.out.println("Class Name is: Lambda7");
		};
		Thread t=new Thread(r1);
		t.start();

	}

}
