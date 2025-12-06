package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                // { 1, 3 },
                // { 2, 6 },
                // { 8, 10 },
                // { 15, 18 }

                // { 1, 6 },
                // { 8, 10 },
                // { 15, 18 }

                // {1,4},{4,5}

                // {4,7},{1,4}

                {5,7},{1,3},{2,6}
        };

        // int[][] ans = merge(intervals);
        int[][] ans = merge(intervals);
        // System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] optimal(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        System.out.println(Arrays.deepToString(intervals));
        List<int[]> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int cStart = intervals[i][0];
            int cEnd = intervals[i][1];

            if (end >= cStart) {
                end = Math.max(cEnd, end);
            } else {
                list.add(new int[] { start, end });
                start = cStart;
                end = cEnd;
            }

        }

        list.add(new int[] { start, end });

        return list.toArray(new int[list.size()][2]);
    }

    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < len; i++) {
            int[] Finterval = intervals[i];
            int Fstart = Finterval[0];
            int Fend = Finterval[1];

            List<Integer> temp = new ArrayList<>();
            int start = -1;
            int end = -1;

            for (int j = i + 1; j < len; j++) {
                int[] Sinterval = intervals[j];
                int Sstart = Sinterval[0];
                int Send = Sinterval[1];

                if (Fend >= Sstart) {
                    start = Math.min(Fstart, Sstart);
                    end = Math.max(Fend, Send);
                    temp.add(start);
                    temp.add(end);
                } else {
                    temp.add(Sstart);
                    temp.add(Send);
                }
            }

            list.add(temp);
        }

        System.out.println(list.get(0));

        return intervals;
    }
}
