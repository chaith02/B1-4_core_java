package Exception;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=121/0;
			System.out.println(num);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Number should not divided by zero");
			
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("out of try-catch-finally");
		

	}

}
