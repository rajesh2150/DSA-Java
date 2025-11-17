package BinarySearch;

public class SingleElementinaSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1,1,2,3,3,4,4,8,8};
		
//		System.out.println(singleNonDuplicate(arr));
		System.out.println(optimal(arr));
	}
	public static int singleNonDuplicate(int[] arr) {

         int xor=0;

         for(int i=0;i<arr.length;i++){
             xor = xor ^ arr[i];
         }
         return xor;
	}
	
	static int optimal(int[] arr) {
		int start=0;
      int end= arr.length-1;

      while(start<end){
          int mid = start + (end -start)/2;
          if(mid%2==0){
             if(arr[mid]!=arr[mid+1]) {
            	 end = mid;
             }
          }
          else{
              start = mid +1;
          }
      }
      return start;

	}

}
