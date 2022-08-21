package com.day1;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer number = in.nextInt();
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum= number*i;
			System.out.println(sum);
		}
	}
}
