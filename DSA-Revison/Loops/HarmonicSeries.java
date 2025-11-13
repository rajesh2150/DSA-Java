package Loops;

public class HarmonicSeries {
	public static void main(String[] args) {
		
		float sum = harmonicSeries(5);
		System.out.println(sum);
	}
	
	public static float harmonicSeries(int times) {
		float sum =0;
		
		for(int i=1;i<=times;i++) {
			sum +=(float) 1/i;
//			System.out.print(""+1/i+ " ");
		}
		
		
		return sum;
	}
}
