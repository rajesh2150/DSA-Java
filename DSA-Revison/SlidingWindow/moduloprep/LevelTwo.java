package SlidingWindow.moduloprep;

import java.util.Arrays;

public class LevelTwo {
    static void fixedWindow(int[] arr, int k) {
        int[] temp = new int[arr.length+k];

        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
            
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                ans[i] += temp[j];
            }
        }

        System.out.println(Arrays.toString(ans));

    }

    static void slidingWindow(int[] code,int k){

        int[] temp = new int[code.length + k];
        int[] ans = new int[code.length];

        for (int i = 0; i < code.length; i++) {
            temp[i]=code[i];
        }

        int sum =0;
        for(int i=1;i<=k;i++){
            sum = sum + temp[i];
        }
        ans[0] = sum;

       


        for(int i=1;i<code.length;i++){
            sum = sum - temp[i]+temp[i+k];
            
            
            ans[i] =sum;
        }

        System.out.println(Arrays.toString(ans));


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5 };
        int k = 3;

        // fixedWindow(arr, k);
        slidingWindow(arr, k);

    }
}
