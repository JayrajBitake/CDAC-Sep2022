package com.cpp.preparation;

import java.util.Scanner;

public class SwappingXOR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2 no");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println("After Swapping n1="+n1+"n2="+n2);

	}

}
