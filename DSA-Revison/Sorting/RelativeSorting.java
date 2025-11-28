package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeSorting {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, arr2 = { 2, 1, 4, 3, 9, 6 };
//		int[] sorted = relativeSortArray(arr1, arr2);
		int[] sorted  = optimal(arr1, arr2);

		System.out.println(Arrays.toString(sorted));
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		List<Integer> miss = new ArrayList<>();
		int[] sorted = new int[arr1.length];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					sorted[index++] = arr1[j];
				}

			}
		}
		for (int j = 0; j < arr1.length; j++) {
			boolean found = false;

			for (int k = 0; k < arr2.length; k++) {
				if (arr1[j] == arr2[k]) {
					found = true;
					break;
				}
			}

			if (!found)
				miss.add(arr1[j]);
		}

		Collections.sort(miss);

		for (int n : miss) {
			sorted[index++] = n;
		}

		return sorted;
	}

	public static int[] optimal(int[] arr1,int[] arr2) {
		int[] freq = new int[1001];
		int index=0;
		
		for(int i=0;i<arr1.length;i++) {
			freq[arr1[i]]++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			int times = freq[arr2[i]];
			while(times>0) {
				arr1[index++]=arr2[i];
				times--;
				
			}
			freq[arr2[i]]=0;
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				while(freq[i]>0) {
					arr1[index++] = i;  
					freq[i]--;
				}
				
			}
		}
		return arr1;
	}
}	
