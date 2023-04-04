package com.m.interFace;

public class InterFaceExample {

	public static void main(String[] args) {
		
		B b = new B();
		b.abc();
		b.abc1();
		
	}

}


	interface A{
	void abc();
	void abc1();
	
}
	
	class B implements A{
		
		public void abc(){
			System.out.println("car");
		}
		public void abc1() {
			System.out.println("flat");
		}
	}