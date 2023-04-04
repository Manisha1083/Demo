package array;

import java.util.Scanner;

public class ArrayScanner2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size of Array : ");
		int rowSize = sc.nextInt();
		
		System.out.println("Enter column size of Array : ");
		int columnSize = sc.nextInt();
		
		//Scanner sc1 = new Scanner(System.in);
		String[][] str = new String[rowSize][columnSize];
		// { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		System.out.println("Enter Array: ");
		//int str1 = str.length;

		for (int i = 0; i <rowSize ; i++) {

			for (int j = 0; j < columnSize; j++) {

				str[i][j] = sc.next();
			}
		}
		System.out.println("Two dimensional string array elements are :\n");
		for (int i = 0; i <rowSize ; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.println("str[" + i + "][" + j + "]:" + str[i][j]);
			}
		}
		System.out.println("Two dimensional string array elements are :\n");
		for (int i = 0; i <rowSize ; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.print(str[i][j]+ " "  );	
			}
			System.out.println();
		}
		
		
			
		
	}
}

