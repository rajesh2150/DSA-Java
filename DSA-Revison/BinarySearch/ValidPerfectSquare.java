package BinarySearch;

public class ValidPerfectSquare{

	public static void main(String[] args) {
		 int num = 4;
//		 System.out.println(isPerfectSquare(num));
		 System.out.println(optimal(num));

	}

	public static boolean isPerfectSquare(int num) {
		//=== For Linear Search TC=> O(n)==
		
        if(num==1) return true;
        for(int i=1;i<num;i++){
            long sqrt = (long) i * i;
            if(sqrt == num){
                return true;
            }
        }
        return false;
    }
	
	static boolean optimal(int num) {
		int start=0;
		int end = num;
		
		while(start<= end) {
			int mid = start + (end - start )/2;
			long sqrt = (long) mid * mid;
			
			if(sqrt==num) return true;
			if(sqrt > num) end = mid -1;
			if(sqrt < num ) start = mid + 1;
		}
		
		return false;
	}
}
