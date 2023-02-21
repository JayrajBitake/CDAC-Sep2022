package com.day2.array;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,6};
		int arr2[]= {11,2,3,43,63};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j])
					System.out.println(arr2[j]);
				
			}
			
			
		}
	}

}
