package Loops;

public class BoyGirl {

	public static int binarySearch(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(start==end) {
				return arr[start]==1?start:-1;
			}
			
			if(arr[mid]==1) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] arr= {0,0,0,0,1,1,1};
		int index=binarySearch(arr);
		
		System.out.println(index);

	}

}
