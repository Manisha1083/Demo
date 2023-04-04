package com.m.thissuper;

public class ballpen extends pen {
	
		String color = "White";
		// Use of super keyword to call parent class praperty
		
		void display(){
			System.out.println(color);
			System.out.println(super.color);
			
		}

}
