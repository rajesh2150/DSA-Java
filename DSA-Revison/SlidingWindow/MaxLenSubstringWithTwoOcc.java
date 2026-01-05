package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxLenSubstringWithTwoOcc {
     public static int maximumLengthSubstring(String s) {
        
        List<String> list = new ArrayList<>();
        int max=0;

        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i+1;j<s.length();j++){
                // for(int k=i;k<=j;k++){
                    sb.append(s.charAt(j));   
                // }
            }
            list.add(sb.toString());
        }
        for(String str : list){
            int len= str.length();
            HashMap<Character,Integer> map = new HashMap<>();
            boolean isValid=true;
            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                if(map.containsKey(ch) && map.get(ch)>2){
                    isValid=false;
                    break;
                }
                 if(map.containsKey(ch) && map.get(ch)<=2){
                    map.put(ch, map.getOrDefault(ch, 0)+1);
                }
                else{
                    map.put(ch,1);
                }  
            }
           
            int count=0;
            for(Character ch : map.keySet()){
                if(map.get(ch)>2){
                    isValid=false;
                 break;
                }    
                if(map.get(ch)<=2){
                
                    count += map.get(ch);
                }
            }
            System.out.println(count);
            if(isValid && count>max){
                System.out.println(map);
                max = Math.max(max, count);
            }
        }
        return max;
    }

    static int better(String s){
        int max=0;
        Map<Character,Integer> map = new HashMap<>();
        boolean isValid=true;
       
        int left=0;
        int right=0;

        while(right<s.length()){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);
           while( map.get(ch)>2){
                char lch = s.charAt(left);
                map.put(lch, map.get(lch)-1);
                left++;
            }
            max=Math.max(max, right-left+1);
            right++;
        }



        return max;
    }

    static int optimal(String s){
        int max=0;

        int left=0;
        int right=0;
        int[] count = new int[26];
        

        while(right<s.length()){
            char ch = s.charAt(right);
            int index = ch-'a';
            if(count[index]<2){
                count[index]++;
                max = Math.max(max, right-left+1);
                right++;

            }

            else{
                int leftIndex = s.charAt(left)-'a';
                count[leftIndex]--;
                left++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        
        String s =  "pfnujyjqajshau";
        // System.out.println("max : "+maximumLengthSubstring(s));
        System.out.println(optimal(s));
    }
}
