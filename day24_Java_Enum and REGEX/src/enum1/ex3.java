package enum1;
enum Bike
{
	Pulser,R15,KTM,R3
}

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike c=Bike.R3;
		switch(c)
		{
		case Pulser:
			System.out.println("You choose Pulser");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R3:
			System.out.println("You choose R3");
			break;
		default:
			System.out.println("Invalid");
			
		}

	}

}
