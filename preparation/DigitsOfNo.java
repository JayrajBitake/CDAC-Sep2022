package com.cpp.preparation;

import java.util.Scanner;

public class DigitsOfNo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n1=sc.nextInt();
		String s=Integer.toString(n1);
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
	}

}
