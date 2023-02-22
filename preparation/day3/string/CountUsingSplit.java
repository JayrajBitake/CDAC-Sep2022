package com.day3.string;

import java.util.Scanner;

public class CountUsingSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.nextLine();
		String s1[]=s.split("\\s+");
		System.out.print(s1.length);
		
	}

}
