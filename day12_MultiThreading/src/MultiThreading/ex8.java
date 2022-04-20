package MultiThreading;

public class ex8 {
	class Counter{
	    int count;
	    public synchronized void increment()
	    {
	        count++;
	    }
	}
	public class Main{
	    public Thread tl;

	public void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter c=new Counter() ;
        Thread t1 =new Thread (new Runnable()
        		{
            public void run () {
                 for (int i=1;i<=1000;i++)
                 {
                     c.increment();
        }
            }
        		});
        Thread t2 =new Thread (new Runnable ()
        {
            public void run()
            {
                for (int i=1;i<=1000 ;i++)
                {
                    c.increment();
                }
            }
        });
        tl.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
            }

	}

}
