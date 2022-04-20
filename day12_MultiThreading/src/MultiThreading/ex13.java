package MultiThreading;

class thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}

public class ex13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t=new thread1();
		t.start();
		t.interrupt();
	}


}
