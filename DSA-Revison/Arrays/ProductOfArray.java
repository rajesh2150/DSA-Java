package Arrays;

import java.util.Arrays;

public class ProductOfArray {

	public static void main(String[] args) {
	
		int[] nums = {1,2,3,4};
		int[] ans = productExceptSelf(nums);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] productExceptSelf(int[] nums) {
		int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	int prod= 1;
        	for(int j=0;j<nums.length;j++) {
                if(i!=j)
        		    prod *= nums[j];
        	}
        	ans[i]=prod;
        }
	return ans;
	}
}
