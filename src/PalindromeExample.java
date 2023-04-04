import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PalindromeExample {

	public static void main(String[] args) throws ParseException {
		
		
		/*int num = 455;
		
		int temp = num;
		
		int revNum =0;
		
		while (num>0) {
			
			int d = num%10;
			
			revNum = revNum * 10+ d;
			
			num = num / 10;
			
		}
		if (temp==revNum) {
			System.out.println(temp +" Number is palindrome");
			
		} else {
			
			System.out.println(temp + " Not palindrome");
		}
		
		String s= "12345";
	
		
		int num = Integer.parseInt(s);
		int revNum = 0;
		int temp = num;
		
		System.out.println(s);
		
		while(num>0) {
			int d = num%10;
			revNum = revNum * 10 +d;
			num = num / 10;
			
			
		}
				
		System.out.println(revNum);
		
		String s1 = String.valueOf(revNum);
		System.out.println(s1);*/
		
		
		SimpleDateFormat DateFor =  new SimpleDateFormat("dd-mm-yyyy");
		Date date = (Date) DateFor.parse("08-04-2022");
		System.out.println(date);
		
	}	

}
