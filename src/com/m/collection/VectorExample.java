package com.m.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		 Vector<Integer> vector = new Vector<>();
		 vector.add(124);
		 vector.add(467);
		 
		 System.out.println(vector.size());
		 
		 System.out.println(vector.get(1));
		 
		// way 1 using iterator 
		/* Iterator<Integer> iterator = vector.iterator()	 
		 while(iterator.hasNext()) {
			 Integer integer = iterator.next();
			 System.out.println(integer);
		 }*/
		 
		 // way 2 using enhanced for loop
		 
		 for(Integer integer:vector) {
			 
			 System.out.println(integer);
		 }
		 //way 3 using listiterator
		 
		 ListIterator<Integer> iterator = vector.listIterator();
		 while(iterator.hasNext()) {
			 Integer integer = iterator.next();
			 System.out.println(integer);
		 }
		  //way 4 using Enumeration
		 
		 Enumeration <Integer> en =  vector.elements();
		 while(en.hasMoreElements()) {
			 Integer integer = en.nextElement();
			 System.out.println(integer);
		 }
	}

}
