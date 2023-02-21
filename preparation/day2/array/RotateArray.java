package com.day2.array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter shift");
		int n=sc.nextInt();
		int temp[]= new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i]=arr[i];
			
		}
		for(int i=n;i<arr.length;i++) {
			arr[i-n]=arr[i];
			
			
		}
		 for (int i = 0; i < n; i++) {
	            arr[i + arr.length- n] = temp[i];
	        }
		for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
		

	}

}
