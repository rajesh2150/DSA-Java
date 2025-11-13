package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Intersection {
	
	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[]  ans = intersection(nums1, nums2);

		System.out.println(Arrays.toString(ans));
	}
	  public static int[] intersection(int[] nums1, int[] nums2) {
	    Set<Integer> set1 = new HashSet<>();
	    for (Integer n : nums1) {
	        set1.add(n);
	    } 
	    Set<Integer> set2 = new HashSet<>();
	    for (Integer n : nums2) {
	        set2.add(n);
	    }
	    set1.retainAll(set2);
	    int[] output = new int[set1.size()];
	    int idx = 0;
	    for (int s : set1) {
	        output[idx++] = s;
	    }
	    return output;
	  }
	}