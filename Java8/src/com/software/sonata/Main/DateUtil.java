package com.software.sonata.Main;

import java.time.LocalDate;

public class DateUtil {

	public static void main(String[] args) {
		getLocalDateFromClock();

	}
	
	public static LocalDate getLocalDateFromClock() {
		LocalDate localDate = LocalDate.now();
		System.out.println("Today's Local date : " + localDate);
		return localDate;
	}

}
