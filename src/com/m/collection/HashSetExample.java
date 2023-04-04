package com.m.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	
	public static void main(String[] args) {
		
	/*	HashSet<Integer> hs = new HashSet<>();
		
		hs.add(123);
		hs.add(456);
		hs.add(786);
		hs.add(123);
		hs.add(456);
		
		System.out.println(hs.hashCode());
		
		System.out.println(hs.size());
		
		for(Integer integer : hs) {
			System.out.println(integer);
		
		}
		
		Iterator <Integer> iterator = hs.iterator();
		while(iterator.hasNext()) {
		
			System.out.println(iterator.next());
		}*/
		
		HashSet<Student> hs = new HashSet<Student>();
		Student student1 = new Student(1, "abc");
		hs.add(student1);
		hs.add(new Student(2 , "abc1"));
		hs.add(new Student(3 , "abc2"));
		
		System.out.println(hs.size());
		
		
		Iterator <Student>itr = hs.iterator();
		 while(itr.hasNext()){
		   	 	Object obj = itr.next();
		   	 	Student student = (Student) obj;
		   		 
		   	 	System.out.println(student.id  );
		   	 System.out.println( student.name);
		   	 	
		   	 	

		}
		for (Student st :hs) {
			System.out.println(st.id+ "   " +st.name);
		}
		
		
		
		
		

	}

}
