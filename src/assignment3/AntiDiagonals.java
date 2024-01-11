package assignment3;

import java.util.Scanner;

public class AntiDiagonals {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the size of the square matrix greater than 0 :");
			n = scanner.nextInt();
		} while (n < 0);

		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the elements : ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("---------Orignal Matrix---------");
		
		for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
		
		System.out.println("-------------Output-------------");
		// method to print anti-diagonals
		printAntiDiagonals(matrix);

		scanner.close();

	}

	private static void printAntiDiagonals(int[][] matrix) {

		
		int length = matrix.length;

		// Check if the matrix has more than one element
		if (length > 1) {
			System.out.println(matrix[0][0]); // Print the top-left element

			// Print anti-diagonals above the main diagonal
			for (int col = 1; col < length; col++) {
				int row = 0, i = col;

				while (i >= 0 && row < length) {
					System.out.print(matrix[row][i] + " ");
					i--;
					row++;
				}
				System.out.println();
			}

			
			// Print anti-diagonals below the main diagonal
			for (int row = 1; row < length - 1; row++) {
				int col = length - 1, i = row;

				while (col >= 0 && i < length) {
					System.out.print(matrix[i][col] + " ");
					i++;
					col--;
				}
				System.out.println();
			}

			System.out.println(matrix[length - 1][length - 1]); // Print the bottom-right element
		} else {
			System.out.println("Can't print the anti-diagonals because you provided the wrong size of the matrix.");
		}

	}
}
