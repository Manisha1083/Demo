package inheritance;


 class Vehicle {

	

	 int speed=70;

	 
	 void display(){
	 
	 System.out.println("Vehicle is running at any speed");
	 
	} 
	 
	 
}

public class Bike extends Vehicle {


			  String model="Bullet";
			  
			  void displayBike(){
			 
			 System.out.println("Bike is running at 80km/hr");
			 
			} 
			 
			 
			  public static void main(String[] args) {
			 
				Bike bk = new Bike();
				
				bk.display();
				bk.displayBike();
				

			 }

			

	}


