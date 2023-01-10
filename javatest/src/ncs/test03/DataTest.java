package ncs.test03;

import java.util.Calendar;

public class DataTest {
	
	public static void main(String[] args) {
		Calendar Day = Calendar.getInstance();
		int Day_year = 1987;
		int Day_month = 5;
		int Day_date = 27;
		
		Calendar toDay = Calendar.getInstance();
		int toDay_year = 2016;
		int toDay_month = 4;
		int toDay_date = 18;
		
		long BDay = Day.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();

		long endDay = (BDay - nowDay) / (60 * 60 * 24 * 1000);
		System.out.println("남은 일: " + endDay);
		
		
	}//m()

}//c
