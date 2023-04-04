package com.m.innerclass;

public class outer {
	// Instance Inner class
		private int a = 10;
		
		/*public class inner{
			
			void display() {
				System.out.println("Outer Class data ="+ a);
			}
		}

	public static void main(String[] args) {
		
		outer outer = new outer();
		outer.inner inner = outer.new inner();
		inner.display();
		
	}

	// Static Inner class
		private static int data = 20;
		//private double pi = 3.14;
		
		static class inner {
			
			public void message() {
				System.out.println("Data from outer class=" +data);
			
			}
		} 
		
		public static void main(String[]args) {
			
			outer.inner inner = new outer.inner();
			inner.message();
		}*/
		// Method Inner class
		 public void display() {
	   		 
	   		 class Inner {   		 
	   			 public int i = 2;   		 
	   			
	   			 public void message() {
	   				 System.out.println("Data from outer class is = "+a);
	   				 System.out.println("Data from inner class is =" + i);
	   			 }   	 
	   		 }
	   		 
	   		 Inner inner = new Inner();  
	   		 inner.message();
	   	 }    
	   	 
	   	 public static void main(String[] args) {   	 
	   		 outer outer = new outer();   	 
	   		 outer.display();    
	   	 }    

	
		
}
