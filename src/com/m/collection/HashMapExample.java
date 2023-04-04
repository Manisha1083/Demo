package com.m.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		String s = "Myspaceclass";
		
		HashMap<Character, Integer> x = new HashMap<Character, Integer>();
		 for(int i=0;i<s.length();i++) {
		Character c = s.charAt(i);
		
		if(x.containsKey(c)) {
			int count = x.get(c);
			x.put(c,count+1);
			
		} else {
			
			x.put(c, 1);
		}
		 }
		 
		 for(Map.Entry<Character,Integer> m : x.entrySet()) {
	//		 System.out.println(m.getKey() +" "+ m.getValue());// Prints frequency of character
			 
		//to print Duplicate character
			 
			 int count = m .getValue();
			 if (count>1) {
				 
				 System.out.println(m.getKey());
			 }
				 
		 }
	}

}
