
public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print 2-46-8........20
		
		/*int count = 1;
		for (int i = 2; i <=20;i= i+2) {
			
			if(count % 2==0) {
				System.out.println(-i);
			}
			else
			{
				System.out.println(i);	
			}
			count++;
		}*/
		
		
	//Summation of 2-4+6-8+10-12......20	
		
		int sum = 0;
		int count = 1;
		
		/*for(int i = 2;i<=20;i=i+2) {
			
			if(count % 2==1) {
				
				sum = sum + i;	
			}
			else
			{
				sum = sum -i;
					
			}
			
			count++;
		}
		System.out.println(sum);*/
		
		//Summation of 1-3+5-7+9.....19
		
		for(int i=1;i<=20;i=i+2) {
			
			if(count%2==0) {
				sum = sum + i;
			}
			else
			{
				sum =sum - i;
			}
			count++;
		}
		System.out.println(sum);
		
		
		
		for (int i = 1;i<= 10;i=i+2)
		{
			if (count % 2==0) {
				
				System.out.println(-i);
			
			}
			else
			{
				System.out.println(+i);
			}
			count++;
		}
		
		
		
		
		
		
		
		

	}

}
