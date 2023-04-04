
public class swithstatement1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c;
		int ch = 2;
			
		switch(ch) {
			case 1:
				c = a + b;
				System.out.println("Addition of two numbers is  " +  c);
				break;
			
			case 2:
				c= a - b;
				System.out.println("Substraction of two numbers is    " +   c);
				break;
				
				
			case 3:
				c = a * b;
				System.out.println("Multiplication of two numbers is  " +  c);
				break;
					
			case 4:
				c = a/b;
				System.out.println("Division of two numbers is"    +    c);
				break;
					
				default:
					System.out.println("Wrong Choice");
			}
	}

}
