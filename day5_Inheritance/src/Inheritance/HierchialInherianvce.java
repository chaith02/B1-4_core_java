package Inheritance;
class CellPhones
{
	void message()
	{
		System.out.println("HI, Chaithra");
	}
	void call()
	{
		System.out.println("I am calling Shushma");
	}

}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.print("Modern Facelock");
	}
}

class Oneplus extends CellPhones
{
	void games()
	{
		System.out.println("PUB-G");
	}
}
public class HierchialInherianvce {

	public static void main(String[] args)
	{
		Oneplus o=new Oneplus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxyM31 m=new SamsungGalaxyM31();
		m.facelock();

	}

}
