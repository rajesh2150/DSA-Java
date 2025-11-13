package BinarySearch;

public class Descending {

	public static void main(String[] args) {
	
		int[] nums = {12,10,9,7,3,1};
		int target =12;
		System.out.println(search(nums, target));

	}

	 public  static int search(int[] nums, int target) {
	        int start=0;
	        int end = nums.length-1;

	        while(start<=end){
	            int mid = start + (end-start)/2;
	            if(nums[mid]==target){
	                return mid;
	            }
	            else if(nums[mid]>target){
	            	 start = mid + 1;
	            }
	            else{
	            	end = mid - 1;
	               
	            }
	        }
	        return -1;
	    }
}
