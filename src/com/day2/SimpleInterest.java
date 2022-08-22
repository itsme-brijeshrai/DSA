package com.day2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter principal amount");
		Integer principal = in.nextInt();
		System.out.println("Enter time given in years");
		Integer year = in.nextInt();
		System.out.println("Enter your rate of interest");
		Integer rate = in.nextInt();
		in.close();
		Integer ans = (principal*rate*year)/100;
		System.out.println("your interest on amount "+principal+  " is Rs. "+ans);
	}

}
