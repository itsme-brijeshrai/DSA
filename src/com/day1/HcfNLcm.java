package com.day1;

import java.util.Scanner;

public class HcfNLcm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number");
		Integer num1 = in.nextInt();
		System.out.println("Enter 2nd number");
		Integer num2 = in.nextInt();
		in.close();
		Integer  temp1 = num1;
	    Integer  temp2 = num2;

	      while(temp2 != 0){
	        Integer temp = temp2;
	         temp2 = temp1%temp2;
	         temp1 = temp;
	      }

	     Integer hcf = temp1;
	     Integer lcm = (num1*num2)/hcf;

	      System.out.println("HCF of input numbers: "+hcf);
	      System.out.println("LCM of input numbers: "+lcm);
	}
}
