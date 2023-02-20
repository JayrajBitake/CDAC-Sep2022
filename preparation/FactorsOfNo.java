package com.cpp.preparation;

import java.util.Scanner;

public class FactorsOfNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n1=sc.nextInt();
		int fact=1;
		for(int i=1;i<n1;i++) {
			if(n1%i==0)
			System.out.print(i+", ");
			
		}

	}

}
