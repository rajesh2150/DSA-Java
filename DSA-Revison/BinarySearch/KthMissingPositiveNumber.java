package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthMissingPositiveNumber {
	public static void main(String[] args) {

		int[] arr = {1,2}; int k = 1;
		
//		System.out.println(findKthPositive(arr, k));
		System.out.println(optimal(arr, k));
	
	}
	

	public static int findKthPositive(int[] arr, int k) {

		int[] freq= new int[1001];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int val =arr[i];
			freq[val]++;
		}
		
		for(int i=1;i<freq.length;i++) {
			if(freq[i]<1) {
				list.add(i);
			}
		}
		
		System.out.println(list);
		
	return list.get(k-1);
	}
	
	
	static int optimal(int[] arr, int  k) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			int oneBased = mid +1 ;
			int missing  = arr[mid] - oneBased;
			
			if(k>missing) {
				start = mid + 1;
			}
			else {
				end = mid -1 ;
			}
			
		}
		return start + k;
		
		
	}

}
