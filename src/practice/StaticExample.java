package practice;

public class StaticExample {
			
	static int b = 30;
	
	
	        
		public static void main(String[] c ) {
			
			{
				StaticExample.b= 40;
				System.out.println("This is my first program");
				System.out.println("Value of static variable is  " +StaticExample.b);
				
				StaticExample obj = new StaticExample();
				StaticExample obj1 = new StaticExample();
				//obj.show();
				obj.b =20;
				
				System.out.println("value of static variable b using class is   " +StaticExample.b);
				System.out.println("value of static variable b using object1   " +obj.b);
				System.out.println("value of static variable b using object2   " +obj1.b);
				
				}
		}
}
