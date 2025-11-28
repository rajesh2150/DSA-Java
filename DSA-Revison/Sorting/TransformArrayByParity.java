package Sorting;
import java.util.*;

public class TransformArrayByParity {

	public static void main(String[] args) {
		
		 int[] nums = {4,3,2,1};
		 int[] ans = transformArray(nums);
		 System.out.println(Arrays.toString(ans));
	}
	
	 public static int[] transformArray(int[] nums) {
		 
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i] % 2 ==0) {
				 nums[i]=0;
			 }
			 else {
				 nums[i] =1;
			 }
		 }
		 Arrays.sort(nums);
		 return nums;
	 }
	 

}
