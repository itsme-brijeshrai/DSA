package com.day1;

import java.util.Scanner;

public class SumofBoth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number");
		Integer num1 = in.nextInt();
		System.out.println("Enter 2nd number");
		Integer num2 = in.nextInt();
		Integer ans = num1+num2;
		System.out.println(ans);
	}
	
}
