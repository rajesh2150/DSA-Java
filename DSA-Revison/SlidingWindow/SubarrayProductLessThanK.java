package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> temp = new ArrayList<>();

                for (int j2 = i; j2 <= j; j2++) {
                    temp.add(nums[j2]);
                }

                lists.add(temp);
            }
        }

        for (List<Integer> list : lists) {
            int len = list.size();
            long prod = 1;
            for (int i = 0; i < len; i++) {
                prod = prod * list.get(i);
            }
            if (prod < k) {
                count++;
                System.out.println(list);
            }
        }

        return count;

    }

    public static int better(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                long prod = 1;
                for (int l = i; l <= j; l++) {
                    prod = prod * nums[l];
                }
                if (prod < k) {
                    count++;
                }

            }
        }

        return count;
    }

    public static int betterTwo(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            long prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod = prod * nums[j];
                if (prod < k) {
                    count++;
                }
                else{
                    break;
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = { 10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3 };
        int k = 19;
        // System.out.println(numSubarrayProductLessThanK(nums, k));
        // System.out.println(better(nums, k));
        System.out.println(betterTwo(nums, k));

    }
}
