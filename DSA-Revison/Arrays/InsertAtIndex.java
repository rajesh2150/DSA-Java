package Arrays;

import java.util.Arrays;

public class InsertAtIndex {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5};
		int index=4;
		int value=3;
		
		insertAtIndex(arr, index, value);
		
		

	}
	
	static void insertAtIndex(int[] arr,int index,int value) {
		
		if(index<0 || index>arr.length) {
			System.out.println("Invalid Index...");
		}
		
		int[] arr2=new int[arr.length+1];
		
		int j=0;
		
		if(index==arr.length) {
			arr2[index]=value;
		}
		
		for(int i=0;i<arr.length;i++) {
			
		
			if(j==index) {
				arr2[j++]=value;
			}
			arr2[j++]=arr[i];
	
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
