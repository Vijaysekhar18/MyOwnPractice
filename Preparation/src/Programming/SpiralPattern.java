package Programming;

import java.util.Arrays;

public class SpiralPattern {

	public static void main(String[] args) {
		/**
		 * dir value
		 * 0 - Represents Right
		 * 1 - Represents Down
		 * 2 - Represents Left
		 * 4 - Represents up
		 */
		int dir = 0;
		int rows = 10, cols = 10;
		int L = 0, R = cols-1, T = 0, B = rows-1;
		int[][] matrix = new int[rows][cols];
		
		int num = 1;
		
		while(L <= R || T <= B) {
			switch(dir) {
				case 0:
					for(int j  = L; j <= R; j++) matrix[T][j] = num++;
					T++;
					break;
				case 1:
					for(int i  = T; i <= B; i++) matrix[i][R] = num++;
					R--;
					break;
				case 2:
					for(int j  = R; j >= L; j--) matrix[B][j] = num++;
					B--;
					break;
				case 3:
					for(int i  = B; i >= T; i--) matrix[i][L] = num++;
					L++;
					break;
			}
			dir = (dir+1) % 4;	//Update the Direction
		}
		printMatrix(matrix);
		System.out.println("******************************");
		
		
	}
	
	public static void printMatrix(int[][] matrix) {
		//Printing the Matrix
				for(int i = 0; i < matrix.length; i++) {
					System.out.println(Arrays.toString(matrix[i]));
				}
	}

}
