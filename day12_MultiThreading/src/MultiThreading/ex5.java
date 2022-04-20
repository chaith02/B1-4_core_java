package MultiThreading;

public class ex5 {
	public synchronized void display()
    {
        System.out.println("Current thread " + Thread . currentThread().getName()); 
        for(int i = 0; i < 5 ; i++)
        {
            System.out.println(Thread.currentThread().getName() + " i - " +i);
            try 
            {
                Thread.sleep(50);
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
    
        }    
    }
class Valueof implements Runnable{
    Thread t; 
  ex5 val; 
    Valueof(ex5 val)
    {
        this.val = val; 
        t = new Thread(this);
        t.start();
    }
    public void run() 
    {
        val.display();
    }
}
public class Main1{
    public Valueof t2;
	public Valueof t1;
	public void main(String[] args) { 
    	ex5 obj1 = new ex5();
    	ex5 obj2 = new ex5();
        t1 = new Valueof(obj1);
        t2 = new Valueof(obj2);
    }
    public void display() {
		// TODO Auto-generated method stub
		
	}

}

}
