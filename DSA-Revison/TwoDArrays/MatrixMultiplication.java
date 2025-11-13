package TwoDArrays;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b= {{7,8},{9,10},{11,12}};
		
		int[][] ans = matrixMultiplication(a, b);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(Arrays.toString(ans[i]));
		}

	}
	
	
	public static int[][] matrixMultiplication(int[][] a, int[][] b){
		int[][] ans = new int[a.length][b[0].length];
		
		if(a.length != b[0].length) {
			return new int[][] {};
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				int sum=0;
				
				for(int each=0;each<b.length;each++) {
					sum= sum +(a[i][each]*b[each][j]);
				}
				
				ans[i][j] =sum;
			}
			
		}
		
		return ans;
		
		
		
	}

}
