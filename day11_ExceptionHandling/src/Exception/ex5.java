package Exception;

import java.io.IOException;
class ex5 
{
	void ex5(int num)throws IOException, ClassNotFoundException
	{
		if(num==1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
		
	}
	

	public static void main(String[] args) {
		try {
			ex5 obj=new ex5();
			obj.ex5(1);
			
		}
		catch(Exception ex) {
			System.out.print(ex);
		}

	}

}
