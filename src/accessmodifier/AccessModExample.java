package accessmodifier;


	/*class A{  
		private int data=40;  //Private scope is within class only
		private void msg(){
			System.out.println("Hello java");
	}  
}  
public class AccessModExample {
	public static void main(String args[]){  
		   A obj=new A();  
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();//Compile Time Error  
		   }  
}*/


/*Access Modifier scope

	Access Modifier	within class	within package	outside package  by subclass only	outside package
		Private	        Y	                N	                N	            N
		Default			Y					Y					N				N
		Protected		Y					Y					Y				N
		Public			Y					Y					Y				Y */