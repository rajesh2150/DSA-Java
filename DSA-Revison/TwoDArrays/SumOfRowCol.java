package TwoDArrays;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SumOfRowCol {

	public static void main(String[] args) {

		int[][] arr = { {1,3,5,4},
						{4,6,7,8},
						{8,9,10,2},
						{12,34,5,6}
					};
		sum(arr);
		
	}
	
	static void sum(int[][] arr) {
		
		int[] row = new int[arr.length];
		int[] col = new int[arr.length];
	
		for(int i=0;i<arr.length;i++) {
			
			int rowSum=0;
			int colSum=0;
			
			for(int j=0;j<arr[i].length;j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			
			row[i] = rowSum;
			col[i] = colSum;
			
			
		}
		
		System.out.println("Row sum : "+Arrays.toString(row));
		System.out.println("Col sum :"+Arrays.toString(col));
		
//		System.out.println("--------");
//		
//		for(int i=0;i<arr.length;i++) {
//			int temp=0;
//			
//			for(int j=0;j<arr[i].length;j++) {
//				temp += arr[j][i];
//			}
//			
//			System.out.println(temp);
//		}
		
	}
	
	

}
