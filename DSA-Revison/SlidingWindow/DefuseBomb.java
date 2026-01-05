package SlidingWindow;

import java.util.Arrays;

public class DefuseBomb {
     public static int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k==0) return ans;

        for(int i=0;i<code.length;i++){
            if(k>0){
        
                for (int j = i+1; j < i+k+1; j++) {
                    ans[i] +=code[j % code.length];
                }
            

        }
        else{
            int n = code.length;
             for (int j = i-1; j  >= (i - Math.abs(k)); j--) {
                   int idx = ((j % n) + n) % n;
                ans[i] += code[idx];
                }

        }
        }
        


        System.out.println(Arrays.toString(ans));
        return ans;
        
    }

    public static void main(String[] args) {
        int[] code = {5,7,1,4};
            int  k = -3;
            System.out.println(decrypt(code, k));
    }
}
