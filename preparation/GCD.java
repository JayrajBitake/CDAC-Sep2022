package com.cpp.preparation;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2  no");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=0,i;
		for(i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0)
				gcd=i;
			
		}
		System.out.println("GCD of 2 no is "+gcd);

	}

}
