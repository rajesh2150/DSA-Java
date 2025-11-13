package Arrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		int[] merged = new int[arr1.length + arr2.length];
		
		mergeArrays(arr1, arr2, merged);
		
		System.out.println(Arrays.toString(merged));

		
	}
	
	public static void mergeArrays(int[] arr1, int[] arr2,int[] merged) {
		
		int j=arr1.length;
		
		for(int i=0;i<arr1.length;i++) {
			
			merged[i]=arr1[i];
			merged[j++]=arr2[i];
		}
	}

}
