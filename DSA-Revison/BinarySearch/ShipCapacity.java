package BinarySearch;

public class ShipCapacity {

	public static void main(String[] args) {
		int[] weights = {1,2,3,1,1};
		int days = 4;
//		System.out.println(shipWithinDays(weights, days));
		System.out.println(optimal(weights, days));
	}

	 public static int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            min= Math.max(min,weights[i]);
            max +=  weights[i];
        }
        
        
        
        for(int i=min;i<max;i++){
        	
            int sum=0;
            int day =0;
            for(int j=0;j<weights.length;j++){
                sum += weights[j];
                if(sum>i){
                    day++;
                    sum -= weights[j];
                    System.out.println("sum "+sum);
                    System.out.println("days "+day);
                }
                
            }
            
            if(day<=days){
                return i;
            }
        }
        
        return -1;
    }
	 
	 static int optimal(int[] weights, int days) {
		 int min = 0;
	      int max=0;
	        for(int i=0;i<weights.length;i++){
	            min= Math.max(min,weights[i]);
	            max +=  weights[i];
	        }
	        
	       int start = min;
	       int end = max;
	       
	       while(start<end) {
	    	   int mid = start + (end - start)/2;
	    	   
	    	   if(isValid(weights,days,mid)) {
	    		   end = mid;
	    	   }
	    	   else {
	    		   start = mid + 1;
	    	   }
	       }
	       
	       return start;
	 }

	private static boolean isValid(int[] weights, int days, int mid) {
		 int sum=0;
         int day =1;
         for(int j=0;j<weights.length;j++){
             sum += weights[j];
             if(sum>mid){
                 day++;
                 sum = weights[j];
               
             }
             
         }
         
         if(day<=days){
             return true;
         }
		return false;
	}
}
