package MultiThreading;

import java.lang.Thread;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current Thread:"+t);
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}

	}

}
