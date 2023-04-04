package com.m.polymorphism;

public class Test {

	
	
	public static void main(String[] args) {
	
		/*A a = new A();
	
		a.m1();
		a.m2();
		a.m6();*/
	
	/*B b = new B();
	
	b.m4();
	b.m5();
	b.m6();*/
		
		A a = new B();
		 a.m1();
		 a.m2();
		 a.m3();
		 a.m6();
		
		
		//B b = new A();
		
		
	/*	A a = new A();
		B b = new B();
		
		a= b;
		a.m6();
		 
		*/

	}

}
