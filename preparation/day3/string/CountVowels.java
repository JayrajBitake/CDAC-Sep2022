package com.day3.string;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.nextLine();
		s=s.toLowerCase();
	int	count =0;
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		
		if((c[i]=='a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u')) {
			count ++;
		}
	}
	System.out.print(count);

	}

}
