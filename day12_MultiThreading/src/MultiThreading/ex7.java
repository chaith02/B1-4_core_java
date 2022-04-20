package MultiThreading;

public class ex7 {
	class Test extends Thread
	{
		public void run()
		{
			System.out.println("thread passed");
		}
		public class Main
		{
			
		
	

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Test create=new Test();
		create.start();
		create.start();
	}
		}

	}

}
