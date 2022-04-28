package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String datetime="2022-04-27 18:15";
		DateTimeFormatter  df=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime, df);
		System.out.println(l);
		

	}

}
