package com.day1;

import java.util.Scanner;

public class PrintTillX {
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		Integer sum = 0;
		String number = "0";
		
		while(!number.equalsIgnoreCase("x")) {
			number=in.next();
			if(number.equalsIgnoreCase("x")) {
				break;
			}
			sum = sum+Integer.parseInt(number);
		}
		System.out.println(sum);
	}

}
