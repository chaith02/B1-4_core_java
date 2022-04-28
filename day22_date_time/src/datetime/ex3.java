package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
		String var=datetime.format(df);
		System.out.println(var);

	}

}
