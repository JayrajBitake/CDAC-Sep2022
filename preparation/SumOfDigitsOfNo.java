package com.cpp.preparation;

import java.util.Scanner;

public class SumOfDigitsOfNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n1=sc.nextInt();
		int l,s=0;
		while(n1!=0) {
			l=n1%10;
			s=s+l;
			n1=n1/10;
			
			
		}
		System.out.println("sum of digits "+s);
	}

}
