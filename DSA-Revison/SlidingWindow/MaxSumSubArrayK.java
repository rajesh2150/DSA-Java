package SlidingWindow;

public class MaxSumSubArrayK {

    static void maxSumSubArrayK(int[] arr, int k) {

        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;

        for(int i=1;i<=arr.length-k;i++){
            //  windowSum = windowSum - arr[i-1];
            //  windowSum =  windowSum + arr[i+k-1];

            windowSum = windowSum - arr[i-1] + arr[i+k-1];
             maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);

     }



    public static void main(String[] args) {
        int [] arr = {4,2,1,7,9,0,2,1,1,0};
        int k =3;
        maxSumSubArrayK(arr, k); 

        
    }
}
