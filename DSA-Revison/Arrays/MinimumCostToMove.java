package Arrays;

public class MinimumCostToMove {

	public static void main(String[] args) {
		
		int[] position = {2,2,2,3,3};
	
		int ans = minCostToMoveChips(position);
		System.out.println(ans);
	}
	

	 public static int minCostToMoveChips(int[] position) {
		 int even=0,odd=0;
		 
		 for(int i=0;i<position.length;i++) {
			 if(position[i]%2==0) {
				 even++;
			 }
			 else {
				 odd++;
			 }
		 }
		 
		 return Math.min(even, odd);
	 }
}
