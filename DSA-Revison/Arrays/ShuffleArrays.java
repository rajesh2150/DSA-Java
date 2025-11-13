package Arrays;

import java.util.Arrays;

public class ShuffleArrays {

	public static void main(String[] args) {
	
		int[] arr= {2,5,1,3,4,7};
		int n=3;
		
		shuffleArrays(arr, n);
		
	}

	static void shuffleArrays(int[] arr,int n) {
		int[] arr2 = new int[arr.length];
		
		int index=0;
		
//		for(int i=0;i<arr.length;i=i+2) {
//			arr2[i] = arr[index++];
//		}
//		
//		for(int i=1;i<=arr.length;i=i+2) {
//			arr2[i]=arr[index++];
//		}
		
		// other 
		
		for(int i=0;i<n;i++) {
			arr2[index]=arr[i];
			arr2[index + 1] = arr[i+n];
			
			index+=2;
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
