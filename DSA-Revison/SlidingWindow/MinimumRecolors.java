package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MinimumRecolors {

    public static int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();

        // for(int i=1;i<=k;i++){
        for (int point = 0; point <= blocks.length() - k; point++) {
            StringBuilder sb = new StringBuilder();
            for (int j = point; j < point + k; j++) {
                // System.out.print(blocks.charAt(j)+" ");
                sb.append(blocks.charAt(j));

            }
            list.add(sb.toString());

            // }

        }

        for (int i = 0; i < list.size(); i++) {
            String slide = list.get(i);
            int len = slide.length();
            int temp = 0;

            for (int j = 0; j < len; j++) {
                // System.out.print(slide.charAt(j));
                if (slide.charAt(j) == 'W') {
                    temp++;
                }
            }
            System.out.println();
            min = Math.min(min, temp);

        }

        System.out.println(list);

        return min;

    }

    public static int minimumRecolors2(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for (int point = 0; point <= blocks.length() - k; point++) {
            StringBuilder sb = new StringBuilder();
            for (int j = point; j < point + k; j++) {
                // System.out.print(blocks.charAt(j)+" ");
                sb.append(blocks.charAt(j));

            }
            int len = sb.length();
            int temp = 0;
            for (int j = 0; j < len; j++) {
                // System.out.print(slide.charAt(j));
                if (sb.charAt(j) == 'W') {
                    temp++;
                }
            }
            // System.out.println();
            min = Math.min(min, temp);

            // }

        }

        return min;
    }

    public static int minimumRecolors3(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(blocks.charAt(i));
        }

        int temp = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'W') {
                temp++;

            }
        }

        min = Math.min(min, temp);

        for (int i = 1; i <=blocks.length() - k; i++) {
            int temp2=0;
            // sb.deleteCharAt(0);
            // sb.append(blocks.charAt(i+k-1));
            if(blocks.charAt(i-1)=='W'){
                temp2++;
            }
            if(blocks.charAt(i+k-1)=='w'){
                temp2++;
            }

            min=Math.min(min, temp2);


            // for (int j = 0; j < sb.length(); j++) {
            //     if (sb.charAt(j) == 'W') {
            //         temp2++;

            //     }
            //     min=Math.min(min, temp2);
            // }
        }
        return min;

    }

    public static int optimal(String blocks, int k){
           int min = Integer.MAX_VALUE;
    

        int temp = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                temp++;

            }
        }

        min =temp;

        for (int i = 1; i <=blocks.length() - k; i++) {

            if(blocks.charAt(i-1)=='W'){
                temp--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                temp++;
            }

            min=Math.min(min, temp);

        }
        return min;
    }
    public static void main(String[] args) {

        String blocks = "WBWBBBW";
        int k = 2;
        // System.out.println(minimumRecolors(blocks, k));
        // System.out.println(minimumRecolors2(blocks, k));
        System.out.println(minimumRecolors3(blocks, k));
    }
}
