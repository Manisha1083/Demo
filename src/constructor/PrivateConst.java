package constructor;

 class PrivateConst {
	
		
		int a;
		String s;
	
		PrivateConst() { // Default Constructor
			a = 0;
			s = null;
		}
	
		PrivateConst(int n1, String s1) { // Parameterised Constructor
	
			a = n1;
			s = s1;
	
		}
	
		void display() {
	
			System.out.println(a + " " + s);
	
		}
	
		PrivateConst(int i, String string, int j) {
	
			System.out.println(i + " " + string + " " + j);
		}
	
		/*
		 * privatePrivateConst(int i) {
		 * 
		 * System.out.println("private constructor value: "+i); }
		 */
	
	}
		
		class PrivateConst1 {
			 
			public static void main(String[] args) {
	
				PrivateConst obj = new PrivateConst(); // call to default constructor
	
				PrivateConst obj1 = new PrivateConst(100, "XYZ"); // call to Parameterized constructor
	
				PrivateConst obj2 = new PrivateConst(1000, "PQR"); // call to Parameterized constructor
	
				PrivateConst obj3 = new PrivateConst(2000, "ABC1",40);
				
			//	PrivateConst obj4 = new PrivateConst(10);
						
				obj.display();
				obj1.display();
				obj2.display();
	
				obj.a = 10;
				obj.s = "ABC";
	
				System.out.println(obj.a + " " + obj.s);
	
			}
	
		}

