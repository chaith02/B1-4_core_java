package Exception;

import java.io.IOException;

public class ex9 {
	void myMethod(int num)throws IOException,ClassNotFoundException{
		if(num==1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
		
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ex9 obj=new ex9();
			obj.myMethod(1);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
