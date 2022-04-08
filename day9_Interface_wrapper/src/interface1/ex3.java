package interface1;
interface ex3 {
	void myMethod();
}
interface ex31 {
	void myOtherMethod();
}
class chaithra implements ex3,ex31 {
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}
class Main123
	{
	public static void main(String[] args) {
		chaithra myObj = new chaithra();
		myObj.myMethod();
		myObj.myOtherMethod();
		
	}
}
