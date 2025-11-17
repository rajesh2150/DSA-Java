package BinarySearch;

public class PeakIndexinaMountainArray {

	public static void main(String[] args) {
		int[] arr = {0,1,0};
//		System.out.println(peakIndexInMountainArray(arr));

		System.out.println(optimal(arr));
	}

	 public static int peakIndexInMountainArray(int[] arr) {
	        int max=arr[0];
	        int maxIndex=0;

	        for(int i=1;i<arr.length;i++){
	            if(arr[i]>max){
	                max =arr[i];
	                maxIndex=i;
	            }
	        }

	        return maxIndex;
	    }
	 public static int optimal(int[] arr) {
 int start=0, end = arr.length-1;
		 
		 while(start<end) {
			//  int mid = end + (start - end)/2;
            int mid = start + (end -start)/2;
			 
			 if(arr[mid]>arr[mid+1]) {
				
				end = mid;
			 }
			 
			 else {
				 start  = mid +1;
			 }
			 
			
		 }
		 
		
		 return start;
		 
		 
	 }
	 
}
