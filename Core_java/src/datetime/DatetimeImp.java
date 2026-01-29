package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatetimeImp {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Date  : "+ date);
		System.out.println("Time  : "+ time);
		System.out.println("Date Time  : "+ dateTime);
		
		//Formatting
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formated = dateTime.format(format);
		System.out.println("Formatted Date Time : "+formated);
	}
}
