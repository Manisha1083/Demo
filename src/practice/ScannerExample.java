package practice;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number-"  );
		
			a=  sc.nextInt();
			
			System.out.println("Enter second number-"  );
			
		int	b= sc.nextInt();
		
		int c = a + b;
		
		if (c > 36) {
			
			System.out.println("c is greater than 36");
			
		}
		else {
			
			System.out.println("number is greater than c");
		}
			
		sc.close();
	}

}
