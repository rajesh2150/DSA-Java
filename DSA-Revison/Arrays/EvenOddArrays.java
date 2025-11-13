package Arrays;

import java.util.Arrays;

public class EvenOddArrays {

	public static void main(String[] args) {
	
		int[] arr= {9,8,7,6,5,4,3,2,1};
	
		evenOddArrays(arr);

	}

	static void evenOddArrays(int[] arr) {
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		
		int e=0;
		int o=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[e++]=	arr[i];
			}
			else {
				odd[o++]=arr[i];
			}
		}
		
		System.out.println("Even : "+Arrays.toString(even));
		System.out.println("Odd : "+Arrays.toString(odd));
	}
}
