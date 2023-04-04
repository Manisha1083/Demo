package inheritance;


class B{
	
		void display() {
			System.out.println("I am Class B member");
		}
	
}

class C{
	
	void display() {
		System.out.println("I am Calss C member");
	}
}



public class ClassA {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		b.display();
		c.display();
	}

}
