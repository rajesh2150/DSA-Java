package Arrays;

public class DivisiblebyThree {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
//		System.out.println(minimumOperations(nums,0));
	
		System.out.println(optimal(nums));
	}

	public static int minimumOperations(int[] nums,int index) {
        
		
		if(index==nums.length) {
			return 0;
		}
		
		int num = nums[index];
	    int operations = 0;

	    // Check divisibility and find required operations
	    if (num % 3 == 0) {
	        operations = 0;
	    } else if ((num - 1) % 3 == 0 || (num + 1) % 3 == 0) {
	        operations = 1;
	    }

	    // Process the rest of the array recursively
	    return operations + minimumOperations(nums, index + 1);
		
		
    }
	
	static int optimal(int[] nums) {
		int min=0;
		
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			if(num %3==0) {
				continue;
			}
			
			if((num-1) %3==0 || (num+1) %3==0) {
				min +=1;
			}
		}
		
		// if(num %3==0) min++
		
		
		return min;
	}
}
