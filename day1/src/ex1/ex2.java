package ex1;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int n1 = scanner.nextInt();
		System.out.println("enter the second number: ");
		int n2 = scanner.nextInt();
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int divide = n1 / n2;
		int modulo = n1 % n2;
		System.out.printf("sum = %d\nsub = %d\nmul = %d\ndivide = %d\nmodulo = %d\n", sum, sub, mul, divide, modulo);
		
		
		

	}

}
