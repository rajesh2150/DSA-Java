package Arrays;

import java.util.Arrays;

public class DeleteAtIndex {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int index=0;
		
		deleteAtIndex(arr,index);;
		
	}

	static void deleteAtIndex(int[] arr,int index) {
		
		// edge cases
		
		if(index>arr.length || index<0) {
			System.out.println("Invalid Index...");
		}
		
		int[] arr2=new int[arr.length-1];
		
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(j==index) {
				arr2[j]=arr[i++];
			}
			arr2[j++]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
