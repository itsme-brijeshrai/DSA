package com.day2;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer number = in.nextInt();
		in.close();
		if(number%2==0) {
			System.out.println("This number is even");
		}else {
			System.out.println("This number is odd");
		}
	}
}
