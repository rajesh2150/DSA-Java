package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {3,5,1,7,8,10,6};
		
		int[] sorted = bubbleSort(arr);
		
		System.out.println(Arrays.toString(sorted));
	}
	
	static int[] bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		return arr;
	}

}
