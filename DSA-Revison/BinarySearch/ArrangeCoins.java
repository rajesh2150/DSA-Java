package BinarySearch;

public class ArrangeCoins {

	public static void main(String[] args) {
		int n = 10;
//		System.out.println(arrangeCoins(n));
//		System.out.println(better(n));
		System.out.println(optimal(n));

	}


	    public static int arrangeCoins(int n) {
	        long sum =0;
	        for(int i=1;i<=n;i++){
	            sum += i;
	            if(sum == n) return i;
	            if(sum > n) return i -1;

	        }

	        return -1;
 
	    
	    }
	    
	    static int better(int n) {
	    	int i = 1;
	        while (n >= i) {
	            n -= i;
	            i++;
	        }
	        return i - 1; // last full row
	    }

	    static int optimal(int n) {
	    	int start=1;
	    	int end =n;
	    	
	    	while(start<end) {
	    		int mid =  start + (end - start)/2;
	    		
	    		long req = (long)(mid * ( mid +1)/2);
	    		if(req==n) {
	    			return mid;
	    		}
	    		else if(req > n) {
	    			end = mid - 1;
	    		}
	    		else {
	    			start = mid + 1;

	    		}
	    	}
	    	return end;
	    }
}
