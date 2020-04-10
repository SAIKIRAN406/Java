package com.software.sonata.Main;

import java.util.Arrays;
import java.util.List;

public class Java8Features {

	public static void main(String[] args) {

		predicatedemo();
		consumerdemo();
		m3();
	

	}

	public static void predicatedemo() {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print  Result from Predicate: " + t));
	}


		public static void consumerdemo() {
			List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
         list1.stream().forEach(t -> System.out.println("print Result from Consumer : " + t));

		}
		
		/* This Method is used for Stashing */
		 public static  void m3(){
         	System.out.println("Java8Features.m3()");

}
	
                        






}
