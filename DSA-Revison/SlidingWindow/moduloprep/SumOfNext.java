package SlidingWindow.moduloprep;

import java.util.Arrays;

public class SumOfNext {

    static void sumOfNext(int[] arr){
          
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            ans[i]=arr[i+1];
        }

        System.out.println(Arrays.toString(ans));

    }
     static void sumOfPrev(int[] arr){
          
        int[] ans = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            ans[i]=arr[i-1];
        }

        System.out.println(Arrays.toString(ans));

    }


    public static void main(String[] args) {
        int[] arr = {2,4,9,3,5,1,7};
        sumOfNext(arr);
        sumOfPrev(arr);
      
    }
}
