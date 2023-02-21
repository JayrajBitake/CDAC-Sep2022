package com.day2.array;

public class MissingNo {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
int sum=0;
int n;

for(int i=0;i<arr.length;i++) {
	
	sum=sum+i;
	
}
n=6*(6-1)/2;

int mno=n-sum;
System.out.println("missing no is "+mno);

	}

}
