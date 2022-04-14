package MultiThreading;

public class ex1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) 
	{
		ex1 e=new ex1();
		e.start();

	}

}
