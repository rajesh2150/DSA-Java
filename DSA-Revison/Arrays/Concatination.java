package Arrays;

import java.util.Arrays;

public class Concatination {

	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4};
		concatination(arr);
		
		int[] nums=new int[2 * arr.length];
		
		System.arraycopy(arr, 0, nums,0,arr.length);
		System.arraycopy(arr, 0, nums, arr.length, arr.length);
		
		System.err.println(Arrays.toString(nums));

	}

	static void concatination(int[] arr) {
		
		int[] arr2= new int[arr.length+arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
			arr2[i+arr.length]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
