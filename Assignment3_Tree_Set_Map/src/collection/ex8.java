package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Queue<Integer>q=new PriorityQueue<Integer>();
		for(i=5;i>0;i++)
		{
			q.add(i);
		}
		System.out.println(q);
	}

}
