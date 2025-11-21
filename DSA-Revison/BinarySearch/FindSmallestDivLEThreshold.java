package BinarySearch;

public class FindSmallestDivLEThreshold {

	public static void main(String[] args) {
	int[] nums = {1,2,5,9}; int threshold = 6;
	
//	System.out.println(smallestDivisor(nums, threshold));
	System.out.println(optimal(nums, threshold));
	}

	  public static int smallestDivisor(int[] nums, int threshold) {
	        
		  int max = Integer.MIN_VALUE;
		  for(int i=0;i<nums.length;i++) {
			  max= Math.max(max, nums[i]);
		  }
		  
		  int minDiv = max;
		  
		  for(int i=1;i<=max;i++) {
			  int sum = 0;
			  int prevSum =0;
			  
			  for(int j=0;j<nums.length;j++) {
				  int div =(int) Math.ceil((double)nums[j]/i);
				  sum += div;
			  }
			  
			 
			  if(sum<=threshold ) {
				  if( sum < prevSum) {
					  minDiv = i;
					  prevSum = sum;
				  }
				  else {
					  minDiv = Math.min(minDiv, i);
					  prevSum = sum;
				  }
			  }
		  }
		  
		  return minDiv;
	    }
	  
	  static int optimal(int[] nums, int threshold) {
		  int max = Integer.MIN_VALUE;
		  for(int i=0;i<nums.length;i++) {
			  max= Math.max(max, nums[i]);
		  }
		  
		  int start =1 , end = max;
		  
		  while(start<end){
			  int mid = start + (end - start)/2;
			  
			  if(isValid(nums,threshold,mid)) {
				  end = mid;
			  }
			  else {
				  start = mid + 1;
			  }
		  }
		  return end;
		  
	  }

	private static boolean isValid(int[] nums, int threshold, int mid) {
		int sum =0;
		int prevSum =0;
		int minDiv=0;
		
		 for(int j=0;j<nums.length;j++) {
			  int div =(int) Math.ceil((double)nums[j]/mid);
			  sum += div;
		  }
		  
		 
		  if(sum<=threshold ) {
//			  if( sum < prevSum) {
//				  minDiv = mid;
//				  prevSum = sum;
//				  
//				  return true;
//			  }
//			  else {
				  minDiv = Math.min(minDiv, mid);
				  prevSum = sum;
				  
				  return true;
//			  }
		  }
		return false;
	}
}
