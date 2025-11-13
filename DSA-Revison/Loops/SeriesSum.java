package Loops;

public class SeriesSum {
	public static void main(String[] args) {
		int number=9;
		int times = 5;
		int sum = seriesSum(number, times);
		
		System.out.println(sum);
	}
	
	
	public static int seriesSum(int number,int times) {
		
		int sum=0;
		int value=1;
		
		for(int i=1;i<=times;i++) {
			sum += number;
			number=(number*10)+9;
		}
		
		
		return sum;
		
	}
}
