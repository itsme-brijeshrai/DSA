package com.day1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year");
		Integer year = in.nextInt();
		if(year%4==0) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("Not a leap year");
		}
	}
}
