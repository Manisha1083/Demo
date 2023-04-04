package com.m.wrapperclass;

 class Constructor {
	int a ;
	String s;
	
	void display() {
		
		System.out.println(a +"  "+s);
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		obj.display();
		
		
		Class obj1 = new Class();
		obj1.display1();
	}

}

  class Class{
	 int a1;
	 String s1;
	 void display1() {
		 System.out.println(a1 +"  "+s1);
	 }
 }