
public class ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 80;
		
		if (marks > 75) {
			
			System.out.println("you got Distinction");
		}
		else if(marks > 60 && marks <= 75){
			System.out.println("you got First Class");
		}
			else if(marks>40 && marks <=60) {
				System.out.println("You got Second Class");
			}
			else if (marks < 40) {
				System.out.println("Fail");
			}
		
			
		
	}

}
