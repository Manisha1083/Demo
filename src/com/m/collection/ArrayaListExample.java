package com.m.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayaListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Size= "  + list.size());
		
		//using for loop
		
		for (int i=0 ;i< list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		//Using Iterator
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			//Object object = (Object)iterator.next();
			//Integer abc = (Integer)object;
			
			System.out.println(iterator.next());
		}
		
		// Using Enhanced for loop
			
		for(Integer i: list) {
			System.out.println(i);
		}
	}

}
