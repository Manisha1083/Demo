package constructor;

public class ParamConstr {

	int a;
	String s;
	
	ParamConstr(){        //Default Constructor
	a=0;
	s=null;
	}
	

	ParamConstr(int n1,String s1){     //Parameterized Constructor

		a=n1;
		s=s1;

		}


		public ParamConstr(int i, String string, int j) {
		 System.out.println(i +" "+s+" "+j);
	}


		public ParamConstr(int i) {
			System.out.println(i);
		}


		void display(){

		System.out.println(a +"  "+ s);


		}

		public static void main(String args[]){

			ParamConstr obj = new ParamConstr(); // call to default constructor

			ParamConstr obj1 = new ParamConstr(100,"XYZ"); // call to Parameterized constructor

			ParamConstr obj2 = new ParamConstr(1000,"PQR"); // call to Parameterized constructor
			
			ParamConstr obj3 = new ParamConstr(200,"ABC1",10);
			ParamConstr obj4 = new ParamConstr(10);

		obj.display();
		obj1.display();
		obj2.display();

		obj.a=10;
		obj.s="ABC";

		System.out.println(obj.a+" "+obj.s);

	}

}


