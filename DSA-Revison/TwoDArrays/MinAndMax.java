package TwoDArrays;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[][] arr = {{1,3,5,4},{4,6,7,8},{8,9,10,2}};
		
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);

	}

}
