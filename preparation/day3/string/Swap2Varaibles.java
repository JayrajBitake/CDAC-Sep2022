package com.day3.string;

import java.util.Scanner;

public class Swap2Varaibles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 string");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		s=s+s1;
		
		s1=s.substring(0,s.length()-s1.length());
		System.out.println(s1);
		s=s.substring(s1.length());
		System.out.println(s);
	
		

	}

}
