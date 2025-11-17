package BinarySearch;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(nums, target));
	}
	
	public static int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            
            if(nums[mid] == target) { // check mid==target
            	return mid; 
            }
           
            if(nums[start]<=nums[mid]) { // first Half is Sorted
            	if(target>=nums[start] && target<=nums[mid]) {
            		end = mid -1;  // if exists
            	}
            	else { 
            		start = mid + 1;  // not exits. 
            	}
            }
            
            else {
            	if(target>=nums[mid] && target<=nums[end]) {
            		start = mid + 1;
            	}
            	else {
            		end = mid -1 ;
            	}
            }
            
        }

        return -1;
    }

}
