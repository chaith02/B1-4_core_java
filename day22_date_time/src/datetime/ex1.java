package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		LocalTime e=LocalTime.now();
		LocalDateTime f=LocalDateTime.now();
		LocalDate d1=LocalDate.of(2022, Month.JANUARY,28);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(d1);

	}

}
