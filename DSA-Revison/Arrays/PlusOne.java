package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		
		int[] digits = {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits)));

	}
	
	 public static int[] plusOne(int[] digits) {
	        int sum = 0;
	        for (int i = 0; i < digits.length; i++) {
	        	sum=sum*10;
	        	if(i==digits.length-1) {
	        		sum = sum + (digits[i]+1);
	        	}
	        	else {
	        		
	        		sum = sum + digits[i];
	        	}
	            
	            
	        }
	       

	        System.out.println(sum);
	        String str = sum + "";


	        List<Integer> list = new ArrayList<>();
	        int index = 0;

	        while (sum > 0) {
	            int rem = sum % 10;
	          list.add(rem);
	            sum = sum / 10;
	        }
	       

//	        list.reversed();
	        int[] ans = new int[list.size()];
	        
	        int i=list.size()-1;
	        for(int n : list) {
	        	ans[i--]=n;
	        }

	        return ans;
	    }

}
