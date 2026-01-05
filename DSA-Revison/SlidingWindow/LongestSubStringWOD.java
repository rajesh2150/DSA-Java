package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LongestSubStringWOD {
    public static int lengthOfLongestSubstring(String s) {
        List<List<Character>> lists = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                List<Character> temp = new ArrayList<>();
                for (int j2 = i; j2 <= j; j2++) {
                    temp.add(s.charAt(j2));

                }
                lists.add(temp);

            }
        }

        for (List<Character> list : lists) {
            int len = list.size();
            boolean isValid = true;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                if (map.containsKey(list.get(i))) {
                    isValid = false;
                    break;
                } else
                    map.put(list.get(i), 1);
            }

            if (isValid) {
                max = Math.max(max, len);
            }
        }

        return max;

    }

    public static int better(String s) {
        int max = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                Map<Character, Integer> map = new HashMap<>();
                boolean isValid = true;

                for (int k = i; k <= j; k++) {
                    if (map.containsKey(s.charAt(k))) {
                        isValid = false;
                        break;
                    } else
                        map.put(s.charAt(k), 1);
                }
                if (isValid) {
                    max = Math.max(max, map.size());
                }
            }

        }

        return max;
    }

    public static int better2(String s) {
        int max = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            Map<Character, Integer> map = new HashMap<>();
            boolean isValid = true;
            for (int j = i; j < len; j++) {
                if (map.containsKey(s.charAt(j))) {
                    isValid = false;
                    break;
                } else
                    map.put(s.charAt(j), 1);

                if (isValid) {
                    max = Math.max(max, map.size());
                }
            }

        }

        return max;
    }

    public static int optimal(String s) {
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();


        int left = 0, right = 0;

        while (right < s.length()) {

            while (map.containsKey(s.charAt(right))) {
                map.remove(s.charAt(left));
                left++;
            }

            map.put(s.charAt(right), 1);
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }

    static int optimal2(String s){
           int max = 0;

        // Map<Character, Integer> map = new HashMap<>();
        boolean[] freq = new boolean[256];

        int left = 0, right = 0;

        while (right < s.length()) {

            while (freq[s.charAt(right)]) {
                freq[s.charAt(left)]=false;
                left++;
            }

            freq[s.charAt(right)]=true;
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        // System.out.println(lengthOfLongestSubstring(s));
        // System.out.println(better(s));
        // System.out.println(better2(s));
        // System.out.println(optimal(s));
        System.out.println(optimal2(s));
    }
}
