package com.cpp.preparation;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n1=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<n1/2;i++) {
			if(n1%i==0) {
				flag=true;
			}
			
			
		}
		if(flag)
			System.out.println("Composite no");
		else
			System.out.println("Prime no");
			
			

	}

}
