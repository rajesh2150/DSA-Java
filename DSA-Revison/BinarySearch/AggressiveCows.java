package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		int stalls[] = {10, 1, 2, 7, 5};
		int k =3;
		System.out.println(aggressiveCows(stalls, k));

	}

	public static int aggressiveCows(int[] stalls,int k) {
		Arrays.sort(stalls);
		
		int start=1;
//		int end = stalls[stalls.length-1] - stalls[0];
		int end = 10^9;
		
		while(start<=end) {
			int mid = start + (end - start )/2;
			if(isValid(stalls,k,mid)) {
				start = mid +1;
			}
			else {
				end = mid -1 ;
			}
		}
		
		return start;
	}

	private static boolean isValid(int[] stalls, int k, int mid) {
		
		int currK=1;
		int last = stalls[0];
		
		for(int i=1;i<stalls.length;i++) {
			if(stalls[i] - last >=mid ) {
				currK++;
				last = stalls[i];
			}
			
		}
		
		return currK>=k;
	}
}
