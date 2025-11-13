package Arrays;

import java.util.Arrays;

public class PrefixXor {

	public static void main(String[] args) {
	
		int[] pref = {5,2,0,3,1};
		System.out.println(Arrays.toString(findArray(pref)));
		
	}
	
	 public static int[] findArray(int[] pref) {
		 int[] ans =new int[pref.length];
		 
		 int xor=0;
		 int pre=0;
		 for(int i=0;i<pref.length;i++) {
			pre= xor ^ pre;
			xor = pre ^ pref[i];
			ans[i] = xor;
			
		 }
		 
		 return ans;
	    }

}
