package Sorting;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
       String ans = largestNumber(nums);
        System.out.println(ans);
        
        
    }
     public static boolean isSwap(int a, int b){
        String ab = a+""+b;
        String ba = b+""+a;

        // int first = Integer.parseInt(ab);
        // int second = Integer.parseInt(ba);

        // return first>second;

        return ba.compareTo(ab) > 0;
    }
    public static String largestNumber(int[] nums) {
        int len = nums.length;  
        String[] arr = new String[len];
        for(int i=0;i<len;i++){
            arr[i] = String.valueOf(nums[i]);
        }  

        Arrays.sort(arr,(a,b)->{
            // String ab = a+""+b;
            // String ba = b+""+a;

            return (b+a).compareTo((a+b));

        });
        // for(int i=0;i<len;i++){
        //     for(int j=0;j<len-i-1;j++){
        //         boolean swap = isSwap(nums[j],nums[j+1]);
        //         if(swap){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<len;i++){
            ans.append(arr[i]);
        }
        if(ans.charAt(0)=='0') return "0";
        return ans.toString();

        // for(int i=0;i<nums.length;i++){
        //     String num = nums[i]+"";
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             num = num + nums[i];
        //         }
        //     }
        //     long temp = Long.parseLong(num);
        //     max = Math.max(max,temp);

        // }

        // return max+"";
    }
}
