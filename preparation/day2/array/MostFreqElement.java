package com.day2.array;

public class MostFreqElement {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,4,2,3,4,3,3};
		int max_count=0;
		int mostfreq=0;
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}
			}
			if(count>max_count) {
				//max_count=count;
				
				mostfreq=arr1[i];
				
			}
		//	count=0;
		
		}
		System.out.println("Most frequent element is "+mostfreq);

	}

}
