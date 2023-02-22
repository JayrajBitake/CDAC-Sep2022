package com.day3.string;

import java.util.Scanner;

public class MostRepeated {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.nextLine();
		int maxcount=0,i;
		char mostfreq=' ';
		char c[]=s.toCharArray();
		for(i=0;i<c.length;i++) 
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				
				if(c[i]==c[j])
					count++;
			}
			if(count>maxcount)
			{
				mostfreq=c[i];
				
			}
		
		}
		System.out.print(mostfreq);
		
	}

}
