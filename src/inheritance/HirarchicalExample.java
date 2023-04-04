package inheritance;
// Example of Hierarchical inheritance Ather & Scooty extends class Two Wheeler

public class HirarchicalExample {

	public static void main(String[] args) {
		Ather at = new Ather();
		at.ride();
		at.ather();
		Scooty sc= new Scooty();
		sc.ride();
		sc.scooty();
	}

}

 class TwoWheeler{
	
	void ride() {
		System.out.println("I am riding Bike");
	}
}

class Ather extends TwoWheeler{
	void ather() {
		System.out.println("I am riding ather");
	}
}

class Scooty extends TwoWheeler{
	
	void scooty() {
		System.out.println("I am riding scooty");
	}
}