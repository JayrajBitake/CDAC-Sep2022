package com.cpp.preparation;

import java.util.Scanner;

public class PositiveNegativeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n1=sc.nextInt();
		//(n1>0) ? (System.out.println("Positive No")):(System.out.println("Negative no"));
		if(n1>0)
			System.out.println("Positive No");
		else
			System.out.println("Negative No");
			

	}

}
