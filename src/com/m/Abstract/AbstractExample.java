package com.m.Abstract;

public  class AbstractExample {
		public static void main(String[] args) {
		
		B b = new B();
		b.abc();
		b.def();
		b.xyz();
	}
}		
		abstract class A{
			abstract void abc();
			abstract void xyz();
			
			void def() {
				System.out.println("farm");
			}
					
				}
		
	
		 class B extends A{
		
			void abc() {
				 System.out.println("car");
			}
			void xyz() {
				System.out.println("flat");
			}
		}
	

	


