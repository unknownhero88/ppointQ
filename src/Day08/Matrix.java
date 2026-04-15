package Day08;

import java.util.*;

public class Matrix {

	public static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(Arrays.toString(m[i]));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Task 1: transpose

		int m2[][] = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				m2[i][j] = matrix[j][i];
			}
		}
		System.out.print("Transpose: ");
		printMatrix(m2);

		// Task 2: row sums
		int rowSum[] = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				rowSum[i] += matrix[i][j];
			}
		}
		System.out.println("Row sums: " + Arrays.toString(rowSum));

		// Task 3: column sums
		int colSum[] = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				colSum[j] += matrix[i][j];
			}
		}
		System.out.println("Column sums: " + Arrays.toString(colSum));

		// Task 4: diagonal sum
		int diagonalSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			diagonalSum += matrix[i][i];
		}
		System.out.println("Diagonal sum: " + diagonalSum);
	}
}