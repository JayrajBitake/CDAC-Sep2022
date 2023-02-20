package com.cpp.preparation;

import java.util.Scanner;

public class SmallestOf3NoWithoutOperators {
	
	public static int smallest(int n1,int n2,int n3) {
		int c=0;
		while(n1!=0 && n2!=0&&n3!=0) {
			
			n1--;
			n2--;
			n3--;
			c++;
		}
		return c;
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 no");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
	int n4=smallest(n1,n2,n3);
	System.out.println("Smallest of 3 no is "+n4);
	
		

	}

}
