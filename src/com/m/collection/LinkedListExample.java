package com.m.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		 LinkedList<String> str = new LinkedList<String>();
		 
		 str.add("Aarya");
		 str.add("Adwait");
		 str.add("Sneha");
		 str.add("Reeva");
		 
		 System.out.println(str.size());
		
		 System.out.println(str.get(3));
		 //using Iterator 
		/* Iterator<String> itr = str.iterator();
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
		 }*/
		 
		 for(String str1 :str) {
			 System.out.println(str1);
		 }
		 
		
	}

}
