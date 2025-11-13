package TwoDArrays;

public class SumOfRightDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1,3,5,4},
						{4,6,7,8},
						{8,9,10,2},
						{12,34,5,6}
					};
		
//		System.out.println(sum(arr));
		System.out.println(optimal(arr));
	}
	
	static int sum(int[][] arr) {
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(i==j) {
					sum += arr[i][j];
				}
			}
		}
		
		return sum;
	}
	
	static int optimal(int[][] arr) {
		int sum=0;
		
		for(int dig=0;dig<arr.length;dig++) {
			sum += arr[dig][dig];
			
		}
		
		return sum;
	}

}
