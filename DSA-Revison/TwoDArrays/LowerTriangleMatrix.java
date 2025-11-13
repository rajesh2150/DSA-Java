package TwoDArrays;

public class LowerTriangleMatrix {

	public static void main(String[] args) {

		int[][] arr = { {1,3,5,4},
						{4,6,7,8},
						{8,9,10,2},
						{12,34,5,6}
					};
		triangle(arr);
		print(arr);
	}
	
	static void triangle(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				arr[i][j]=0;
			}
		}
	}
	
	public static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
					
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
