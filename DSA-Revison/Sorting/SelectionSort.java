package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		
		int[] sorted = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			int minPostion = findMin(arr);
			sorted[i] = arr[minPostion];
			arr[minPostion] = Integer.MAX_VALUE;
		}
		return sorted;
	}

	private static int findMin(int[] arr) {
		
		int position=0;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				position=i;
			}
			
		}
		return position;
	}

	
	public static int[] inplace(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int minPosition = findMin(arr,i);
			
			int temp = arr[i];
			arr[i] = arr[minPosition];
			arr[minPosition] = temp;
		}
		
		return arr;
	}
	private static int findMin(int[] arr, int start) {
		int position=start;
		int min = arr[0];
		
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
			min = arr[i];
			position=i;
		}
		}
		return position;
	}

	public static void main(String[] args) {
		int[] arr = {10,2,5,4,3,1};
		
//		int[] sorted = selectionSort(arr);
		
		int[] sorted = inplace(arr);
		
		System.out.println(Arrays.toString(sorted));
		
//		System.out.println(Arrays.toString(sorted));
		

	}

}
