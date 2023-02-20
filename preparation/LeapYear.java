package com.cpp.preparation;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int n1=sc.nextInt();
		if((n1%4==0  && n1%100!=0) ||  n1%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");

	}

}
