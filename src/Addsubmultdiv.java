
public class Addsubmultdiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		
		int b = 20;
		
		int sum= a+ b;

		int sub= a - b;

		int multi = a * b;

		int div = a / b;

		int mod = a % b;
		
		int incre = a++;
		int decre = b--;
		
		
		
		
		
		System.out.println("Addition of a & b ="+ sum);
		
		System.out.println("Substraction of a & b ="+ sub);
		
		System.out.println("multi of a & b ="+ multi);
		
		System.out.println("div of a & b ="+ div);
		
		System.out.println("mod of a & b ="+ mod);
		System.out.println("Increment:" + incre);
		System.out.println("Decrement:"+ decre);
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(a<b ? a:b);
		
		

	}

}
