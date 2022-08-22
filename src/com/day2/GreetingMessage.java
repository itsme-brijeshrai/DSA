package com.day2;

import java.util.Scanner;

public class GreetingMessage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.next();
		in.close();
		System.out.println("Hello "+name);

	}

}
