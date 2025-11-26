package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static int[] insertionSort(int[] arr){
		
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		
		return arr;
	}
		

	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4};
		int[] sorted = insertionSort(arr);
		
		System.out.println(Arrays.toString(sorted));

	}

}
