package com.m.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		
	 List<Student> list = new ArrayList<Student>();
	 
	 list.add(new Student(3 , "ABC"));
	 list.add(new Student(2 , "xyz"));
	 list.add(new Student(1 , "DEF"));
		
	Collections.sort(list);
	
	 for(Student student : list) {
		 System.out.println(student.rollNo+"  "+ student.name);
	 }


	}
}

/*public class TestSort{  
 
public static void main(String args[]){  
	
	ArrayList<Student> al=new ArrayList<Student>();  
	
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
  
	Collections.sort(al);  
	for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  */