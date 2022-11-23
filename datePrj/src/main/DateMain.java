package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) throws ParseException {

		//날짜
		
		//Date, Calender, Timestamp, SimpleDateFormat, LocalDateTime
//		long curr = System.currentTimeMillis();
//		
//		System.out.println(curr);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = sdf.parse("2022-11-08");
		
		long ms1 = d1.getTime();
		
		System.out.println(ms1);
		
		long nextDay = ms1 + (1000*60*60*24);
		
		Date d2 = new Date(nextDay);
		
		System.out.println(d2);
		
		long Sec = (d1.getTime() - d2.getTime()) / 1000; // 초
		 long Min = (d1.getTime() - d2.getTime()) / 60000; // 분
		 long Hour = (d1.getTime() - d2.getTime()) / 3600000; // 시
		 long Days = Sec / (24*60*60); // 일자수
	        
		 System.out.println(Sec + "초 차이");
		 System.out.println(Min + "분 차이");
		 System.out.println(Hour + "시 차이");
		 System.out.println(Days + "일 차이");
		
	}

}
