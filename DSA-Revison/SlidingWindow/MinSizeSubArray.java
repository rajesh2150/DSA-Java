package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSizeSubArray {

    public static int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> temp = new ArrayList<>();

                for (int j2 = i; j2 <= j; j2++) {
                    temp.add(nums[j2]);

                }
                list.add(temp);
            }
        }

        for (List<Integer> l : list) {
            int len = l.size();
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum = sum + l.get(i);
            }

            if (sum >= target) {
                min = Math.min(min, len);
            }
        }

        System.out.println(list);
        return min;
    }

    public static int better(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum = sum + nums[j2];
                }
                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                }
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static int betterTwo(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0; // move sum here
            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; // reuse previous sum
                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    // public static int betterThree(int target, int[] nums){
    // int min=Integer.MAX_VALUE;
    // Arrays.sort(nums);

    // for (int i = 0; i < nums.length; i++) {
    // int val = target - nums[i];
    // int ind = binarySearch(val,nums);

    // int sum = nums[i]+nums[ind];

    // }

    // return min;
    // }

    // private static int binarySearch(int val, int[] nums) {
    // int start=0;
    // int end= nums.length-1;

    // while (start<=end) {
    // int mid = start + (end-start)/2;

    // if(nums[mid]==val){
    // return mid;
    // }
    // }

    // }

    public static int optimal(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

       int left=0,right=0;
       int sum=0;

       while (right<nums.length) {
        sum = sum + nums[right];

        if(sum>=target){
            while (sum>=target) {
                min = Math.min(min,right-left+1);
                sum =  sum - nums[left];
                left++;
            }

        }
        right++;

       }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        // System.out.println(minSubArrayLen(target, nums));
        // System.out.println(better(target, nums));
        // System.out.println(betterTwo(target, nums));
        System.out.println(optimal(target, nums));
    }
}
