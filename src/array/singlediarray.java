package array;

public class singlediarray {

	public static void main(String[] args) {
		
		int [] a = {10,20,3,4,5};
		//print array list
		for(int i = 0;i<a.length; i++){
			 System.out.println(a[i]);
			 
		}
		//print array length
		System.out.println("******************");
		System.out.println(a.length);
		
		
		// printing array using for each loop
		for(int i:a) {
			System.out.println(i);
		}
		
		//Print min. num. in array list
		System.out.println("**********");
		
		int min =a[0];
		
		for(int i =1;i< a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			
			}
			
		}
		System.out.println(min);
		System.out.println("************");
		int max = a[0];
		for (int i = 1;i< a.length;i++) {		// max no. in array
			if (max< a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
		System.out.println("************");
		int sum = 0;
	for(int i=0;i < a.length;i++) {				//sum 
		 sum = sum+a[i];
		
	}
	
	System.out.println(sum);
	}

}
