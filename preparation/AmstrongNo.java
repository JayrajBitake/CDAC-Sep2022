package com.cpp.preparation;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n1=sc.nextInt();
		int count=0,r,on=n1;
		double sum=0;
		int n2=n1;
		while(n1!=0) {

			n1=n1/10;
			count++;
			
		}
		System.out.println(count);
		while(n2>0) {
			
			r=n1%10;
			
			sum=sum+(Math.pow(r,count));
			System.out.println(sum);
			n2=n2/10;
			
		}
		
		if(on==sum) {
			System.out.println("Amstrong no");
		}
		else
			System.out.println(" not a Amstrong no");

	}

}
