package com.software.sonata.Main;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeUtil {

	public static void main(String[] args) {
		 LocalTime time = LocalTime.now();
			System.out.println(" Time You logged in is " + time);
			LocalDateTime dateTime = LocalDateTime.now();
			System.out.println(" Date and time LocalDateTime You logged in is  " + dateTime);

	}


}
