package constructor;

public class Constructor1 {
	
	
	int a;
	String s;
	
	Constructor1(){        //Default Constructor
	a=0;
	s=null;
	}
	

	Constructor1(int n1,String s1){     //Parameterized Constructor

		a=n1;
		s=s1;

		}


		void display(){

		System.out.println(a +"  "+ s);


		}

		public static void main(String args[]){

			Constructor1 obj = new Constructor1(); // call to default constructor

			Constructor1 obj1 = new Constructor1(100,"XYZ"); // call to Parameterized constructor

			Constructor1 obj2 = new Constructor1(1000,"PQR"); // call to Parameterized constructor

		obj.display();
		obj1.display();
		obj2.display();

		obj.a=10;
		obj.s="ABC";

		System.out.println(obj.a+" "+obj.s);

	}

}
