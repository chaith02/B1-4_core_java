package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(15, "chaithra");
		s.remove(12, null);
		s.remove(12);
		System.out.println(s);
		s.firstEntry();
	}

}
