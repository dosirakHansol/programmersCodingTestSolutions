package guessDayOfTheWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(5,24));;
		
	}
	
    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
 
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dow = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US);
        
        return dow.toUpperCase();
    }

}
