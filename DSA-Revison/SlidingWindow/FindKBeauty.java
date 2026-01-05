package SlidingWindow;

public class FindKBeauty {
    static int findKBeauty(int num, int k){
        int count=0;

        int len =(int) Math.log10(num)+1;
        int mod = (int)Math.pow(10,k);
        int temp = num;

        int times =len - k+1;

        while (times>0) {
            int div = temp % mod;
            if(div !=0 && num%div==0){
                count++;
            }
            temp = temp/10;
            times--;
        }

        return count;
    }
    public static void main(String[] args) {
        int num = 240, k = 2;
        System.out.println(findKBeauty(num, k));
    }
}
