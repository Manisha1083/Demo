
public class summationofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //print nos. 1/2 +2/3 + 3/4 + 4/5 ..... 10/11;
		/*int numerator = 0;
		int denominator = 0;
		
		for (int i= 1;i<=10;i++)
		{
			numerator = i;
			denominator = i + 1;
			System.out.println(numerator + "/" + denominator);
		}
		
		
		
		 //print nos. 1/2 -2/3 + 3/4 - 4/5 ..... 10/11;
		int count = 1;
		for (int i= 1;i<=10;i++){
			numerator = i;
			denominator = i+1;
			
			if(count % 2==1) {
			
			System.out.println(numerator + "/" + denominator);
			}
			else {
				
				
				System.out.println( -numerator + "/" + denominator);
			}
			count++;
			
		}*/
		
		
		
		
		
		//summation of 1/2-2/3+3/4-4/5...10/11
		int count =1;
		int sum = 0;
		
		
		for (int i = 1;i<=10;i++)
		{
			
			
			if (count % 2==1)
			{
				sum = sum + (i/i+1);
				
			}
			else {
				sum = sum - (i/i+1);
			}
			count++;
		}
		System.out.println(sum);
		

	}

}
