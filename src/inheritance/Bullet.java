package inheritance;

//Multilevel Inheritance

class Vehicle1 { 

	int speed = 70;

	void display() {

		System.out.println("Vehicle is running at any speed");

	}

}
	class Bike1 extends Vehicle1 { 

		String model = "Bullet";

		void displayBike() {

			System.out.println("Bike is running at 80km/hr");

		}
	
	}
	class Bullet extends Bike1 {

		int cc = 350;

		void displaybullet() {
			System.out.println("350 CC Bullet");
		}

		public static void main(String[] args) {
			Bullet bk = new Bullet();

			bk.display();
			bk.displayBike();
			bk.displaybullet();

		}

	}

