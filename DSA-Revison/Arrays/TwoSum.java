package Arrays;

import java.util.Arrays;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
//		System.out.println(Arrays.toString(twoSum(nums, target)));
		System.out.println(Arrays.toString(optimal(nums, target)));
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (sum == target) {
					return new int[] { nums[i], nums[j] };
				}
			}
		}

		return new int[] { -1, -1 };

	}
	
	
	public static int[] optimal(int[] nums,int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
			
		for(int i=0;i<nums.length;i++) {
			int val = nums[i];
			int sum = Math.abs(target-val);
			
			if(map.containsKey(sum)) {
				return new int[] {i,map.get(sum)};
			}
			else {
				map.put(nums[i],i);
			}
		}
		
		return new int[] { -1, -1 };

	}

}
