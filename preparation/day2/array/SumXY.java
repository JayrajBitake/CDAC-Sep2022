package com.day2.array;

import java.util.Scanner;

public class SumXY {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sum");
		int n=sc.nextInt();
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n)
				{
					System.out.println("Found at "+i+" "+j);
					
				}
				
			}
		}
	}

}
