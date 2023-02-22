package com.day3.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 string");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int l1=s.length();
		int l2=s1.length();
		char c1[]=s.toCharArray();
		char c2[]=s1.toCharArray();
		 Arrays.sort(c1);
		 Arrays.sort(c2);
//		 for(char x:c2)
//			 System.out.println(x);
		 boolean result = Arrays.equals(c1, c2);
		 if(result)
		 {
			 System.out.println("Analgrms");
		 }
		 else
			 System.out.println(" Not Analgrms");
		
		

	}

}
