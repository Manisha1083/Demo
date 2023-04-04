package com.m.wrapperclass;


public class WrapperExample {

	public static void main(String[] args) {
		// Convert Primitive to Object
		
		// Integer
		int a = 20;
		
		Integer i = Integer.valueOf(a);
		
		System.out.println( "a = " +a);
		System.out.println("i = "+i.toString());
		
		//flaot
		float b = 30;
		
		Float f = Float.valueOf(b);
		
		System.out.println( "b = " +b);
		System.out.println("f = "+f.toString());
		
		//Double
		double c = 50;
		Double d = Double.valueOf(c);
		
		System.out.println( "c = " +c);
		System.out.println("d = "+d.toString());
		
		//String
		String s = "abc";
		String s1 = String.valueOf(s);
		System.out.println( "s = " +s);
		System.out.println("s1 = "+s1.toString());
		
		//Boolean
		boolean b1 = true;
		Boolean b2 = Boolean.valueOf(b1);
		System.out.println( "b1 = " +b1);
		System.out.println("b2 = "+b2.toString());
		

		// Convert Object to Primitive
		
		int i1 = i.intValue();
		System.out.println("i1= "+i1);
		
	
		
	}

}
