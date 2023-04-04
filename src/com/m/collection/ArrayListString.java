package com.m.collection;

import java.util.ArrayList;


// adding duplicates in other list
public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("cat");
		list1.add("dog");
		list1.add("cow");
		list1.add("cat");
		list1.add("cow");
		list1.add("dog");
		list1.add("tiger");
		
		System.out.println(list1.size());
		
		for(int i = 0; i<list1.size();i++) {
			if(list2.contains(list1.get(i))) {
				
			}
		
				
			else {
				list2.add(list1.get(i));
			}
		}
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println(list2.size());
	}

}
