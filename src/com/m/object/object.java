package com.m.object;

public class object {

	int rollNumber;
	String name;

	public int getrollNumber() {
		return rollNumber;
	}

	public void setrollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	//@Overriding the toString() method 
	/*public String toString(){//overriding the toString() method  
		  return rollNumber+" "+name;  
	}*/
		  
	public static void main(String[] args) {

		object s = new object();
		s.setrollNumber(100);
		s.setname("abc");

		object s1 = new object();
		s1.setrollNumber(100);
		s1.setname("abc");
		//implementation of Object class methods

		System.out.println(s1.hashCode());
		System.out.println(s.getClass());
		System.out.println(s.equals(s1));
		System.out.println(s.toString());// without override toString()displays only hashvalues of object
		System.out.println(s.getClass().getName());
		
	}

}
