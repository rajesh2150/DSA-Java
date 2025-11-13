package Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		reverse(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	static void reverse(int[] nums) {
		int start=0;
		int end=nums.length-1;
		
		while(start<=end) {
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
