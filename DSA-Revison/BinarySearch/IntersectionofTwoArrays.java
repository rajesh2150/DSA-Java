package BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 2, 1}, nums2 = { 1, 2 };
		
		int[] ans = intersection(nums1, nums2);
		
		System.out.println(Arrays.toString(ans));

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		
		Arrays.sort(nums2);

		for (int i = 0; i < nums1.length; i++) {

			boolean isValid = search(nums2, nums1[i]);
			if (isValid) {
				set.add(nums1[i]);
			}
		}

		int len = set.size();
		int[] ans = new int[len];
		int index = 0;

		for (int n : set) {
			ans[index++] = n;
		}
		return ans;

	}

	public static boolean search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return true;
			} else if (nums[mid] > target) {
				
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		}
		return false;
	}

}
