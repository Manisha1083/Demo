package array;

import java.util.Scanner;

public class ArrayMultiplicatinScanner {

	public static void main(String[] args) {
		int m, n, p, q;
		int sum = 0; 
		 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix");
	      m = in.nextInt();
	      n = in.nextInt();
	 
	      int first[][] = new int[m][n];
	 
	      System.out.println("Enter elements of first matrix");
	 
	      for (int c = 0; c < m; c++)
	         for (int d = 0; d < n; d++)
	            first[c][d] = in.nextInt();
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      p = in.nextInt();
	      q = in.nextInt();
	 
	      if (n != p)
	         System.out.println("The matrices can't be multiplied with each other.");
	      else
	      {
	         int second[][] = new int[p][q];
	         int multiply[][] = new int[m][q];
	 
	         System.out.println("Enter elements of second matrix");
	 
	         for (int c = 0; c < p; c++)
	            for (int d = 0; d < q; d++)
	               second[c][d] = in.nextInt();
	 
	         for (int c = 0; c < m; c++)
	         {
	            for (int d = 0; d < q; d++)
	            {  
	               for (int k = 0; k < p; k++)
	               {
	                  sum = sum + first[c][k]*second[k][d];
	               }
	 
	               multiply[c][d] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product of the matrices:");
	 
	         for (int c = 0; c < m; c++)
	         {
	            for (int d = 0; d < q; d++)
	               System.out.print(multiply[c][d]+"\t");
	 
	            System.out.print("\n");
	         }
	      }

	}

}
