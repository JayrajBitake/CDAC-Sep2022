package com.day3.string;

import java.util.Scanner;

public class Revesre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.nextLine();
	int	n=s.length()-1;
//		while(n>=0) {
//			
//			System.out.print(s.charAt(i));
//			i--;
//			
//		}
	for(int i=s.length();i>0;--i)                  
	{  
	System.out.print(s.charAt(i-1));            
	} 

	}

}
