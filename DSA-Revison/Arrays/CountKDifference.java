package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountKDifference {

	public static void main(String[] args) {

		 int[] nums = {1,2,2,1};
		 int k = 1;

			System.out.println(optimal(nums, k));
	}
	
	public static int countKDifference(int[] nums, int k) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int sum = Math.abs(val - nums[j]);
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}

	
	public static int optimal(int[] nums, int k) {

		int count = 0;
		Map<Integer,Integer> map = new HashMap<>(); 

		for (int i = 0; i < nums.length; i++) {
			int sum = Math.abs(nums[i] - k);
			if(map.containsKey(sum)) {
				
				count+=map.get(sum);
			}
			if(map.containsKey(nums[i] + k)) {
				
				count+=map.get(nums[i] + k);
			}
			
				map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
			
		}
		System.out.println(map);
		return count;
	}
}
