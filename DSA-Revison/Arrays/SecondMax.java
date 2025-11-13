package Arrays;

public class SecondMax {

	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5,6,7,10,9};
		secondMax(arr);
		

	}

	static void secondMax(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int smax=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
				
			}

			if(arr[i]>smax && arr[i]<max) {
				smax=arr[i];
			}
			
		}
		System.out.println(smax);
	}
}
