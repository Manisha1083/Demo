package array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class arrayExamples {

	public static void main(String[] args) {
		
		Integer arr[] =  {12,5,8,3,7};
		
	/*	int temp ;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
				}
				
				
			}
			
				
			}
		System.out.println("descending order");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}*/
		
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Descending");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	
			
		}
		
		
}
	
	
	
	
