package com.day2;

import java.util.Scanner;

public class RupeeToDollar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount in rupee you have");
		Integer rupee = in.nextInt();
		in.close();
		Double dollar = (rupee*0.013);
		System.out.println("Your currency value in Dollar is "+dollar);

	}

}
