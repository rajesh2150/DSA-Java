package BinarySearch;

public class KokoEatingBananas {

	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int h = 8;
		
		System.out.println(minEatingSpeed(piles, h));
	}
	
	 public static int minEatingSpeed(int[] piles, int h) {
	        int max=0;
	        for(int i=0;i<piles.length;i++){
	            if(piles[i] > max){
	                max = piles[i];
	            }
	        }
	        int min = max;
	        
	        for(int i=1;i<=max;i++){
	        	int times =0;
	        	
	           for(int j=0;j<piles.length;j++) {
	        	   
	        	   int temp = (int) Math.ceil((double) piles[j] / i);
	        	   times += temp;
	        	   if(times > h) break;
	        	   
	           }
	           
	           if(times<=h) {
	        	   min = i;
	        	   break;
	           }
	        }
	        
	        return min;
	    }

}
