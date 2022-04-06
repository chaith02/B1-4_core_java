package polymorphism;

public class renault {
	String color;
	int speed;
	renault()
	{
		System.out.println("I brought renault triber in 2021");
	}
	renault(String color,int speed)
	{
		this.color=color;
		this.speed=speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		renault r=new renault();
		renault r1=new renault("mustard yellow",50);
		System.out.println(r1.color+" "+r1.speed);

	}

}
