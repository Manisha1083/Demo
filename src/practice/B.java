package practice;


public class B {

		int a;

		B() {

		}

		public static void show() {
			System.out.println("Static method invoked");
		}

		public void display() {
			System.out.println("Non-static method invoked");

		}

		public static void main(String args[]) {
			System.out.println("In the main method");

			show();

			// Object Creation

			B obj = new B();

			obj.display();
			obj.a = 100;
			System.out.println(obj.a);

		}

	}




