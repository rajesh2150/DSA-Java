package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {4,3,2,5,6,7,1};
		System.out.println(linearSearch(arr,1));
	}

	private static int linearSearch(int[] arr,int target) {

		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
