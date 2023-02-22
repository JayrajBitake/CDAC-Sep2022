package com.day3.string;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.nextLine();
	int	count =0;
	int n=s.length();
	while(n!=0) {
		n--;
		
		count ++;
	}
	
	System.out.println(count);

	}

}
