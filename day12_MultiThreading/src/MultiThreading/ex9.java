package MultiThreading;

public class ex9 {
	class Main extends ex9{
		public void run ()
		{
		    for (int i=1;i<=3;i++)
		    {
		        System.out.println ("doing task "+i);
		    }
		}
		}

		public class Main1{
		public final ex9 t1 = null;

	public  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ex9 t1=new ex9 ();
	    t1.start();
	    System.out.println("is thread interrupted"+t1.isInterrupted());
	    t1.interrupt();
	    System.out.println("is thread interrupted"+t1.isInterrupted());
}
}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public String isInterrupted() {
		// TODO Auto-generated method stub
		return null;
	}

	public void interrupt() {

	}

}
