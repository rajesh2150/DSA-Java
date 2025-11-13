package TwoDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

//		setZeroes(matrix);
//		better(matrix);
		optimal(matrix);
		
		for(int i=0;i<matrix.length;i++) {
			System.out.print(Arrays.toString(matrix[i]));
		}
	}

	public static void setZeroes(int[][] matrix) {

		List<Integer> rows = new ArrayList<>();
		List<Integer> cols = new ArrayList<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);

				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for(int n:rows) {
					if(n==i) {
						matrix[i][j] = 0;
					}
				}
				for(int n:cols) {
					if(n==j) {
						matrix[i][j] = 0;
					}
				}
			}
		}

	}
	
	public static void better(int[][] matrix) {
		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rows[i]=true;
					cols[j]=true;

				}
			}
		}
		
		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (rows[i]) {
					matrix[i][j]=0;
				}
			}
		}
		
		for (int i = 0; i < cols.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (cols[i]) {
					matrix[j][i]=0;
				}
			}
		}

	}
	
	public static void optimal(int[][] matrix) {
		boolean firstRow=false;
		boolean firstCol= false;
		
		for(int i=0;i<matrix[0].length;i++) {
			if(matrix[0][i]==0) {
				firstRow=true;
				break;
			}
		}
		
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i][0]==0) {
				firstCol=true;
				break;
			}
		}
		
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[0].length;j++) {
				if(matrix[i][j]==0) {
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[0].length;j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
			}
		}
		
		if(firstCol) {
			for(int i=0;i<matrix.length;i++) {
				matrix[i][0]=0;
			}
		}
		
		if(firstRow) {
			for(int i=0;i<matrix[0].length;i++) {
				matrix[0][i]=0;
			}
		}
		
	}
}
