package com.cpp.preparation;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  no");
		int n1=sc.nextInt();
		int on=n1;
		int l=0,r=0;
		while(n1!=0) {
			
			l=n1%10;
			r=r*10+l;
			n1=n1/10;
			
		}
		if(r==on)
			System.out.println("Palindrome");
		else
			System.out.println(" not Palindrome");
	}

}
