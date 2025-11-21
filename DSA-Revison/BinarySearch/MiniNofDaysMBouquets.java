package BinarySearch;

import java.util.Arrays;

public class MiniNofDaysMBouquets {

	public static void main(String[] args) {
		int[] bloomDay = { 1, 10, 3, 10, 2 };
		int m = 3, k = 2;

		System.out.println(minDays(bloomDay, m, k));

	}

	public static int minDays(int[] bloomDay, int m, int k) {

		int max = -1;
		int min= Integer.MAX_VALUE;
		for (int i = 0; i < bloomDay.length; i++) {
			max = Math.max(max, bloomDay[i]);
			min = Math.min(min,bloomDay[i]);
		}

//		int start = min, end = max;
//
//		while (start < end) {
//			int mid = start + (end - start) / 2;
//
//			if (isValid(bloomDay, m, k, mid)) {
//				end = mid;
//			} else {
//				start = mid + 1;
//			}
//
//		}

//		return isValid(bloomDay, m, k, start) ? start : -1;
		
		int days=0;
		for(int i=min;i<=max;i++) {
			if(isValid(bloomDay, min, k, i)) {
				days= Math.min(days, i);
			}
		}
		
		return isValid(bloomDay, m, k, days) ? days : -1;
		

	}

	private static boolean isValid(int[] bloomDay, int m, int k, int day) {

		int flowers = 0;
		int boqutes=0;
		for (int i = 0; i < bloomDay.length; i++) {

			if (bloomDay[i] <= day) {
				flowers++;
				if(flowers==k) {
					boqutes++;
					flowers=0;
				}
			}
			else {
	            flowers = 0; // reset count if not bloomed (break adjacency)
	        }
		}

		return boqutes>=m;
	}

}
