package enum1;

public class ex5 
{
	enum Day
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d=Day.SATURDAY;
		printDisplay(d);
	}
		
	public static void printDisplay(Day d) {
		{
			if(d==Day.SATURDAY)
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Not Same");
			}
		}

	}

}
