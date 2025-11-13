package Arrays;

import java.util.Arrays;

public class TransformArraybyParity {

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,1};
		
		System.out.println(Arrays.toString(transformArray(nums)));

	}
	 public static int[] transformArray(int[] nums) {
	        int[] ans = new int[nums.length];

	            int last=nums.length-1;
	            int first=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]%2==0){
	                ans[first++]=0;
	            }
	            else{
	                ans[last--]=1;
	            }
	        }

	return ans;
	    }
}
