package com.m.thissuper;

public class student {
	int rollNumber;
	String name;
	float fees;
	// use of this to distinguish between local variable & instance variable
	
	student(int rollNumber,String name ,float fees){
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.fees = fees;
	}
	void display() {
		
		System.out.println(rollNumber+" "+ name +" "+ fees);
	}

	public static void main(String[] args) {
		
		student s1 = new student(101,"abc",5000f);
		
		student s2 =new student (102, "xyz",7000f);
		
		s1.display();
		s2.display();
	}

}
