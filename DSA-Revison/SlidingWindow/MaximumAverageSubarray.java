package SlidingWindow;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        
         int initialWindow = 0;
        for(int i=0;i<k;i++){
            initialWindow += nums[i];
        }
        double max =(double) initialWindow/k;

        for(int i=1;i<=nums.length-k;i++){
            initialWindow = initialWindow - nums[i-1]+nums[i+k -1];
            double temp = (double)initialWindow/k;
            max = Math.max(max,temp);
        }

        return max;
    }
    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
        
    }
}
