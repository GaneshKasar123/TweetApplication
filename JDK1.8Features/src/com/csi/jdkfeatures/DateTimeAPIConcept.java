package com.csi.jdkfeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeAPIConcept {
	public static void main(String[] args) {

		System.out.println("JDK 1.7 Date: "+ new Date());
		
		System.out.println("JDK 1.8 Date: "+ LocalDate.now());
		
		System.out.println("JDK 1.8 LocalDateTime: "+ LocalDateTime.now());
		
		
		System.out.println("Year: "+ LocalDate.now().plusYears(3).isLeapYear());
		
		System.out.println("WE H A V  E D O N E ");
	}
}
