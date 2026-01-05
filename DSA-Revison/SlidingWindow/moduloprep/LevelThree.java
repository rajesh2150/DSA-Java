package SlidingWindow.moduloprep;

import java.util.Arrays;

public class LevelThree {
    static void printCircular(int[] code){
        int[] ans = new int[code.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = code[(i+1) % code.length];
            
        }
        System.out.println(Arrays.toString(ans));


    }

    static void prevCircular(int[] code){
        int[] ans = new int[code.length];

        int n = code.length;

        for(int i=0;i<code.length;i++){
            ans[i] = code[(i-1+n)%n];
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] code = {10,20,30};
        // printCircular(code);
        prevCircular(code);
        
    }
}
