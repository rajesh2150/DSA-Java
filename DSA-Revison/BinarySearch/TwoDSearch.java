package BinarySearch;

public class TwoDSearch {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {1, 3, 5, 7},
			    {10, 11, 16, 20},
			    {23, 30, 34, 60}
			};

			int target = 3;
			
//			System.out.println(searchMatrix(matrix, target));
			System.out.println(optimal(matrix, target));
			

	}

	public static boolean searchMatrix(int[][] matrix, int target) {
        
		for(int i=0;i<matrix.length;i++) {
			if(isValid(matrix[i],target)) {
				return true;
			}
		}
		
		return false;
    }

	private static boolean isValid(int[] arr, int target) {
	
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid  = start + (end - start)/2;
			if(arr[mid]==target) return true;
			else if(arr[mid]<target) start = mid +1;
			else end = mid - 1;
		}
		return false;
	}
	
	
	static boolean optimal(int[][] arr,int target) {
		int start =0;
		int end = arr.length * arr[0].length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			int row = mid / arr.length;
			int col = mid % arr.length;
			
			if(arr[row][col]==target) return true;
			else if(arr[row][col] < target) start= mid + 1;
			else end = mid -1;
		}
		
		return false;
	}
}
