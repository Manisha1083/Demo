package constructor;


class Class1 {
	int a;   // Instance
	String s;

	Class1() { // Default Constructor
		//a = 0;
		//s = null;
	}

	Class1(int n1, String s1) { // Parameterised Constructor

		a = n1;
		s = s1;

	}
	
	Class1(Class1 obj1) { //  Copy Constructor

		a = obj1.a;
		s = obj1.s;

	}

	void display() {

		System.out.println(a + " " + s);

	}

	Class1(int i, String string, int j) {

		System.out.println(i + " " + string + " " + j);
	}

	/*
	 * private Class1(int i) {
	 * 
	 * System.out.println("private constructor value: "+i); }
	 */
}
 class CopyConstr {

	public static void main(String[] args) {
		Class1 obj = new Class1(); // call to default constructor

		Class1 obj1 = new Class1(100, "XYZ"); // call to Parameterized constructor

		Class1 obj2	= new Class1(1000, "XYZr"); // call to Parameterized constructor
		
		Class1 obj3	= new Class1(obj); // call to Copy constructor
		
		Class1 obj4 = new Class1(obj1); // call to copy parameterized constructor
		
		Class1 obj5 = new Class1(obj2);
		
		
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		obj5.display();
		

	}

}
