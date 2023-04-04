package com.m.polymorphism;



class Employee1 {

	
	  void show() {
	  
	  System.out.println("I am an Employee");
	  
	  }
	 
}

class Tester1 extends Employee1 {
	
	  void show() {
	  
		 // super.show();
	  System.out.println("I am working as Test Engineer");
	  
	  }
	 
	public static void main(String args[])

	{

		//Employee1 ref = new Employee1();
		//	ref.show();
		
		//Tester test = new Tester();

		//	test.show();
		
		//Employee1 ref = new Tester();   // Upcasting

		//Tester ref = new Employee1(); //
		
		//ref.show();
		
		//Webdriver driver = new Chromedriver();
		//driver.get();
		
		
		
		
		
	}

}
