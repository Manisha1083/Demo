package array;

public class ArrayMultiplication {

	public static void main(String[] args) {
		
		//creating two matrices    
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		
		for(int i=0;i<3;i++){    
		
			for(int j=0;j<3;j++){    
		  
				c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j] +=a[i][k]*b[k][j];      
		}							
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}								  
		
		System.out.println();    
		}    
		
	}

}
