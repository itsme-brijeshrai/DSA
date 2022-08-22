package com.day2;

import java.util.Scanner;

public class NumberAndOperator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1");
		Integer num1 = in.nextInt();
		System.out.println("Enter number 2");
		Integer num2 = in.nextInt();
		System.out.println("Enter any operand +/-+*+/");
		String operand = in.next();
		in.close();
		Integer ans =0;
		if(operand.equalsIgnoreCase("+")) {
			ans+=num1+num2;
		}else if(operand.equalsIgnoreCase("-")) {
			ans+=num1-num2;
		}else if (operand.equalsIgnoreCase("*")) {
			ans += num1*num2;
		}else if(operand.equalsIgnoreCase("/*")){
			ans += num1/num2;
		}
		System.out.println(ans);
	}

}
