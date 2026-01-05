package SlidingWindow.moduloprep;

import java.util.Arrays;

public class LevelFour {
    // Sum of next 2 elements (circular)

    static int[] sumOfNextTwo(int[] code, int k) {
        int[] ans = new int[code.length];

        for (int i = 0; i < code.length; i++) {
            int sum = 0;

            for (int j = i + 1; j <= i + k; j++) {
                sum = sum + code[j % code.length];

                System.out.print(code[j % code.length] + " ");

            }
            ans[i] = sum;
            System.out.println();

        }
        System.out.println(Arrays.toString(ans));

        return ans;

    }

    static int[] sumOfPrevTwo(int[] code, int k) {
        k = -k;

        int[] ans = new int[code.length];

        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                System.out.print(code[(j - k + code.length) % code.length]);

                sum = sum + code[(j - k + code.length) % code.length];
            }
            ans[i] = sum;
            System.out.println();
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    static int[] diffuseBomb(int[] code, int k) {
        int[] ans = new int[code.length];
        if (k == 0) {
            return ans;
        } else if (k > 0) {
            return sumOfNextTwo(code, k);
        } else {
            return sumOfPrevTwo(code, k);
        }

    }

    static int[] optimal(int[] code, int k) {
        int[] ans = new int[code.length];



        int sum = 0;

        if (k == 0) {
            return ans;
        } else if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum = sum + code[i];
            }

            ans[0] = sum;

            for (int i = 1; i < ans.length; i++) {
                sum = sum - code[i] + code[(i + k) % code.length];
                ans[i] = sum;
            }

            System.out.println(Arrays.toString(ans));

            return ans;
        } else {
            k = -k;
            int n = code.length;


            for (int i = 1; i <= k; i++) {
                sum = sum + code[(n-i)%n];
            }

            ans[0] = sum;

            for (int i = 1; i < ans.length; i++) {
                sum = sum - code[(i-k+n-1) % n ] + code[(i-1+n) % code.length];
                ans[i] = sum;
            }

            System.out.println(Arrays.toString(ans));

            return ans;

        }
    }

    public static void main(String[] args) {

        int[] code = { 2, 4, 9, 3 };
        int k = -2;
        // sumOfNextTwo(code,k);
        // diffuseBomb(code, k);
        optimal(code, k);
    }
}
