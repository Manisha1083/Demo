package array;

import java.util.Arrays;

public class ForEachLoop {
	
	

		public static void main(String[] args) {
			int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

			String m1[] = { "abc", "tctdf", "dygdyg", "hhsg" };

			int m2[] = { 10,20,30 };
			System.out.println("Matrix: ");
			for (int[] row : matrix) {
				for (int element : row) {
					System.out.print(element + " ");
				}
				System.out.println();
			}

			System.out.println("String  1 D array: ");
			for (String element : m1) {
				System.out.print(element + " ");
			}
			System.out.println();
			System.out.print("String  1 D array using toString Method: "+ Arrays.toString(m1)+"\n");
			System.out.println("String  1 D array using asList Method: "+ Arrays.asList(m1)+"\n");
			
			System.out.println("String  2 D array using deepToString: "+ Arrays.deepToString(matrix));
			System.out.println("String  2 D array using deepToString: "+ Arrays.deepToString(m1));
			//System.out.println("String  2 D array using deepToString: "+ Arrays.deep);
		}

	}

