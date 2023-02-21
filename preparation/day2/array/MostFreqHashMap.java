package com.day2.array;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostFreqHashMap {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]= {1,2,3,4,5,6,7,4,2,3,4,3,3};
		 for(int i = 0; i <arr.length; i++)
	        {
	            int key = arr[i];
	            if(hm.containsKey(key))
	            {
	                int freq = hm.get(key);
	                
	                freq++;
	                hm.put(key, freq);
	                
	            }
	            else
	            {
	                hm.put(key, 1);
	            }
	            
	           // System.out.println(key);
	            
	            
	            
	        }
		 
		 int max_count = 0, res = -1;
         
	        for(Entry<Integer, Integer> val : hm.entrySet())
	        {
	            if (max_count < val.getValue())
	            {
	                res = val.getKey();
	                max_count = val.getValue();
	            }
	        }
	          
	        System.out.println(res);
	}

}
