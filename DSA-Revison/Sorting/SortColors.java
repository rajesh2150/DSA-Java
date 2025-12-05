package Sorting;

import java.util.Arrays;

class SortColors {
    public static void main(String[] args) {
        int[] nums  ={2,0,2,1,1,0};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int len = nums.length;
        int zeros = 0,twos = nums.length-1;
        int i=0;
       while(i<=twos){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] =nums[zeros];
                nums[zeros] = temp;
                zeros++;
                 i++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                 int temp = nums[i];
                nums[i] =nums[twos];
                nums[twos] = temp;
                twos--;
                 
            }
           
        }
       
    //    int zeros = 0, ones = 0, twos =0;
    //     int len = nums.length;

    //    for(int i=0;i<len;i++){
    //     if(nums[i]==0) zeros++;
    //     else if(nums[i]==1) ones++;
    //     else twos++;
    //    }

    //    for(int i=0;i<zeros;i++){
    //     nums[i]=0;
    //    }

    //    for(int i = zeros;i<zeros + ones;i++){
    //     nums[i] = 1;
    //    }
    //    for(int i=zeros + ones;i<len;i++){
    //     nums[i]=2;
    //    }


        
    }
}