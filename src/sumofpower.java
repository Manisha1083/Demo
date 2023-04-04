
public class sumofpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print sum of 1^2 - 2^2 + 3^2 - 4^2 + 5^2 ---- 10^2

		int sum = 0;
		int count =1;
	
		for (int i=1;i<= 10;i++)
		{
			
			if(count % 2== 1) {
				
				sum = sum +  (i*i);
			}
			else 
			{
				sum = sum - (i*i);
			}
			count++;
		}
		System.out.println(sum);

	}

	

}
