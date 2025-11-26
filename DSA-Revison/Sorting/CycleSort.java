package Sorting;

import java.util.Arrays;

public class CycleSort {
	
	public static int[] cycleSort(int[] arr) {
		int index =0;
		while(index<arr.length) {
			if(index==arr[index]) {
				index++;
			}
			else {
				int temp = arr[index];
				arr[index] = arr[arr[index]];
				arr[temp] = temp;
			}
		}
		
		return arr;
	}
	
	public static int[] cycleSort1ToN(int[] arr) {
		int index =0;
		while(index<arr.length) {
			int element = arr[index];
			int actualPosition = element - 1;
			
			if(arr[index] != arr[actualPosition]) {
				int temp = arr[index];
				arr[index] = arr[actualPosition];
				arr[actualPosition] = temp;
			}
			else {
				index++;
			}
		}
		
		return arr;
	}
	
	public static int[] cycleSortForAll(int[] arr) {
		
		int index =0;
		while(index<arr.length) {
		
			int actualPosition = findHowManySmaller(arr,arr[index]);
			
			
			
			if(arr[index] != arr[actualPosition]) {
				
				int swapPosition = actualPosition;
				if(swapPosition>arr.length) {
					continue;
				}
				int temp = arr[index];
				arr[index] = arr[swapPosition];
				arr[swapPosition] = temp;
				
				
				System.out.println(Arrays.toString(arr));
			}
			else {
				index++;
			}
		}
		
		return arr;
	}

	private static int findHowManySmaller(int[] arr, int ele) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ele) {
				count++;
			}
		}
		
		System.out.println(ele +" has "+count);
		return count;
	}

	public static void main(String[] args) {
		
//		int[] arr = {1,2,0,4,3};
		int[] arr = {10,5,2,3};
		
		System.out.println(Arrays.toString(arr));
		int[] sorted = cycleSortForAll(arr);
		System.out.println(Arrays.toString(sorted));
		
	}

}
