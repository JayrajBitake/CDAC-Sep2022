package com.day3.string;

import java.util.Scanner;

public class Permutations {
	public static void permutation(String s,String res) {
		
		 
        if (s.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
        	
        	
        	char c=s.charAt(i);
        	// System.out.println(c + " ");
        	  String ros = s.substring(0, i) +s.substring(i + 1);
        			 // System.out.print(ros + " ");
        			  permutation(ros,res+c);
        	
        	
        	
        }
		
		
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String s=sc.next();
		 permutation(s," ");
		
	}

}
