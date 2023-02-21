package com.day2.array;

public class SecondLargest {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int max=0,smax=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<i;j++) {
			
			if(arr[j]<arr[i])
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
		}
	}
	
	System.out.println("Second max element is "+arr[2]);
	System.out.println("Second min element is "+arr[arr.length-1]);

	}

}
