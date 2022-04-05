package abst;

class Person{
	
	void information(){
		System.out.println("person method");
		
	}
}
class Student extends Person{
	void information() {
		System.out.println("Student method");
	}
	void display() {
		information();
		super.information();
	}
}

public class assignment1 {

	public static void main(String[] args) {
		Student a=new Student();
		a.display();
		

	}

}
