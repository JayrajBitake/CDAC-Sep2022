package com.day2.array;

import java.util.Scanner;

public class AvgOfArray {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to enter in array");
		
		 n=sc.nextInt();
		 System.out.println("enter array elements");
		 int arr[]=new int[n];
		 for(i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
			 
		 }
		 System.out.println("array elements");
		 for(i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
			 
		 }
		 System.out.println();
		 int avg=0;
		 for(i=0;i<arr.length;i++) {
			 
			 avg+=arr[i];
			 
		 }
		 System.out.print("Avg of array is"+avg);
		 
		 
		
	}

}
