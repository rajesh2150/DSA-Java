package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		
		int[] nums = {1,1,2,2,3,4,4};
		System.out.println(uniqueElements2(nums));

	}
	
	public static Set<Integer> uniqueElements(int[] nums){
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		return set;
	}
	
	static List<Integer> uniqueElements2(int[] nums){
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			int val = nums[i];
			int temp=0;
			for(int j=i+1;j<nums.length;j++) {
				if(val==nums[j]) {
					temp++;
				}
			}
			if(temp==0) {
				list.add(val);
			}
		}
		
		return list;
	}

}
