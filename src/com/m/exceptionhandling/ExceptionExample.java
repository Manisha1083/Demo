package com.m.exceptionhandling;

public class ExceptionExample {
	
	//static	int a = 20;
	//static int b = 0;
	

	public static void main(String[] args) {
		
		
			
	
	/*	try {

			int c = a / b;

			System.out.println(c);

		} catch (ArithmeticException e) {

			System.out.println("It is Arithmatic Exception Example");
			e.printStackTrace();
		}*/
		
		try {
		String s = null;
		System.out.println(s.length());
		} 
			catch (NullPointerException n) {
				
				System.out.println("This is Null Poniter Exception");
				n.printStackTrace();
			}
}
}