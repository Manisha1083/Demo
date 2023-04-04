package com.m.objectcreation;

public class NewInstance {
		
	String str = "abc";	
	
	
	
	public static void main(String[] args) {
		
		
		try {
		NewInstance s = NewInstance.class.newInstance();
		System.out.println(s.str);
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
