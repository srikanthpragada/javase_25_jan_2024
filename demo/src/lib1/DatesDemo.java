package lib1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesDemo {

	public static void main(String[] args) {
		 var ct = LocalDateTime.now();
		 System.out.println(ct);
		 
		 DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MMM-uuuu HH:mm:ss"); 
		 System.out.println(LocalDateTime.now().format(format));

	}

}
