package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayForm {

	public static void main(String[] args) {
		int[] num = {1,2,0,0};
		int k = 34;

//		List<Integer> list = addToArrayForm(num, k);
		List<Integer> list = optimal(num, k);
		
		System.out.println(list);
	}
	public static List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> list = new ArrayList<>();
		
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			
			sum = sum*10;
			sum+=num[i];
		}
		
		System.out.println(sum);
		
		sum= sum +k;
		
		
		while(sum>0) {
			int rem=sum%10;
			list.add(rem);
			sum=sum/10;
		}
		
		
		return list.reversed();
		
    }

	
	public static List<Integer> optimal(int[] num, int k){ // TC O(n) SC O(
		List<Integer> list = new ArrayList<>();
		
		int index= num.length-1;
		int carry=0;
		
		while(index>=0 || k >0) {
			
			int lastNum = index<0 ? 0 : num[index];
			int lastK = k %10;
			
			int sum = lastNum + lastK + carry;
			
			int lastSumDigit = sum % 10;
			list.add(lastSumDigit);
			
			carry = sum > 9 ? 1 : 0;
			
			index--;
			k = k /10;
		}
		
		if(carry==1) {
			list.add(1);
		}
		
		return list.reversed();
	}
}
