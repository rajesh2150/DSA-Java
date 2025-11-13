package BinarySearch;

import java.util.Arrays;

public class TwoSumTwo {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 9;
//		System.out.println(Arrays.toString(twoSum(numbers, target)));
		System.out.println(Arrays.toString(optimal(numbers, target)));
	}
	public static int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
	
	static int[] optimal(int[] nums, int target) {
		int start =0;
		int end=nums.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			int sum = nums[start]+nums[end];
			if(sum==target) return new int[] {start+1, end+1};
			else if(sum > target) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		
		return new int[] {-1,-1};
	}

}
