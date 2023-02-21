package com.day2.array;

public class MoveZero2Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,0,0,4,6,0,0,0};
		int k=0;
		for(int i=0;i<arr1.length;i++) 
		{
			
			if(arr1[i]==0)
			{
				int temp=arr1[i];
    			arr1[i]=arr1[k];
    			arr1[k]=temp;
    			k++;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=arr1.length-1;i>0;i--) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
