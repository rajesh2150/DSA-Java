package Arrays;

import java.util.Iterator;

public class FindNumbers {

	public static void main(String[] args) {
	
		int[] nums = {12,345,2,6,7896};
		
//		System.out.println(optimal(nums));
		System.out.println(constraint(nums));
	}
	
	public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            String str=nums[i]+"";
            if(str.length()%2==0){
                count++;
            }
        }

        return count;
    }
	
	public static int better(int[] nums) {
		int count=0;
		
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			int temp=0;
			while(num>0) {
				int rem = num %10;
				temp++;
				num = num/10;
			}
			
			if(temp % 2 ==0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int optimal(int[] nums) {
		int count=0;
		
		for(int i=0;i<nums.length;i++) {
			int len = (int)Math.log10(nums[i])+1;
			if(len %2==0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int constraint(int[] nums) {
		int count=0;
		
		for(int i=0;i<nums.length;i++) {
			int val= nums[i];
			if((val>9 && val<=99) || (val>999 && val<=9999) || (val==100000)) {
			count++;	
			}
				
		}
		
		return count;
	}

}
