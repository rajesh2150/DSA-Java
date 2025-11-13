package TwoDArrays;

import java.util.Arrays;


public class FlippinganImage {

	public static void main(String[] args) {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		flipAndInvertImage(image);
		print(image);
		
	}

	public static void flipAndInvertImage(int[][] image) {
		
		for(int i=0;i<image.length;i++) {
			reverse(image[i]);
			
		}
		
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[i].length;j++) {
					
				image[i][j]= image[i][j]==1?0:1;
			}
			System.out.println();
		}
		
		
		
	}

	private static void reverse(int[] arr) {
		int start=0;
		int end = arr.length-1;
		
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
	}
	
	public static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
					
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}