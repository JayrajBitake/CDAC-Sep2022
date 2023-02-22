package com.day3.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.nextLine();
		int l=s.length();
		Boolean flag=false;
		for(int i=0;i<l;i++) {
			flag=false;
			if(s.charAt(i)==s.charAt(l-i-1))
			
			{
				flag=true;
			}
			
			
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println(" Not Palindrome");

	}

}
