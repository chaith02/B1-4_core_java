package abst;

class Person1{
	
	Person1(){
		System.out.println("person constructor");
		
	}
}
class Student1 extends Person1{
	Student1() {
		super();
		System.out.println("Student constructor");
	}
	
}

public class assignment2 {

	public static void main(String[] args) {
		Student1 a=new Student1();

	}

}
