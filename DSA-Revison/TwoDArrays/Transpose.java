package TwoDArrays;

public class Transpose {

	public static void main(String[] args) {
		int[][] arr = { {1,3,5,4},
						{4,6,7,8},
						{8,9,10,2},
						{12,34,5,6}
						};
		int c = arr[0].length;	int r=arr.length;
	
		
		int[][] transpose = new int[c][r];
		
//		for(int row=0;row<arr.length;row++) {
//			for(int col=0;col<arr[row].length;col++) {
//				transpose[col][row] = arr[row][col];
//			}
//		}
		
//		for(int row=0;row<transpose.length;row++) {
//			for(int col=0;col<transpose[row].length;col++) {
//				System.out.print(transpose[row][col]+" ");
//			}
//			System.out.println();
//		}

		for(int row=0;row<arr.length;row++) {
			for(int col=row;col<arr[row].length;col++) {  // we need to swap form row/ row+1
				int temp = arr[row][col];
				arr[row][col] = arr[col][row] ;
				arr[col][row] = temp;
				
			}
		}

		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
	}

}
