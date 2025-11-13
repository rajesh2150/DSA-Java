package Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

//		rotate(nums, k);
		optimal(nums, k);
		
		System.out.println(Arrays.toString(nums));

	}

	public static void rotate(int[] nums, int k) {
		
		int[] last = new int[k];
		int[] first = new int[nums.length-k];
		
		//edge cases
		
		if(nums.length==1) {
			return;
		}
		
		k=k % nums.length;
		if(k==0) return;
		
		for(int i=0;i<nums.length-k;i++) {
			first[i]=nums[i];
		}
		
		int index=0;
		for(int i=nums.length-1;i>=nums.length-k;i--) {
			last[index++] = nums[i];
		}
		
		reverse(last);
		
		for(int i=0;i<last.length;i++) {
			nums[i]=last[i];
		}
		
		for(int i=0;i<first.length;i++) {
			nums[i+k]=first[i];
		}
		
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(last));
	}
	
	public static void reverse(int[] nums) {
		int start=0;
		int end= nums.length-1;
		
		while(start<=end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	public static void reverse(int[] nums,int start, int end) {
		
		
		while(start<=end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void optimal(int[] nums, int k) {
		reverse(nums,0,nums.length-1-k);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);
	}

}
