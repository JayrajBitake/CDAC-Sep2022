package com.day3.string;

import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  2 string");
		String s=sc.nextLine();
		String s2=sc.next();
		if(s.length()!=s2.length())
		{
			System.out.print("Not rotation");
			
		}
		else
		{
			s=s.concat(s2);
			 if(s.indexOf(s2) != -1)  
	                System.out.println("Second string is a rotation of first string");  
	            else  
	                System.out.println("Second string is not a rotation of first string");  
			
			
		}
		

	}

}
