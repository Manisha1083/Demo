package com.m.innerclass;

public class TestAnonymousInner {

	public static void main(String[] args) {
		
		Person p = new Person() {
			
			public void eat() {
				
				System.out.println("I am in Anonymous class");
			}
		};
		
		p.eat();
	}

}
