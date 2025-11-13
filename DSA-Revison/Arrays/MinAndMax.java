package Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[] arr= {1,4,5,7,3,6,9};
		minAndMax(arr);
		
		

	}
	
	static void minAndMax(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}

}
