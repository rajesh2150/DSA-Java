package Loops;

public class StepsToZero {

	public static void main(String[] args) {
		
		int num=14;
		int steps = stepsToZero(num);
		
		System.out.println(steps);
	}

	public static int stepsToZero(int num) {
		int steps=0;
		
		while(num>0) {
			if(num%2==0) {
				
				num=num/2;
			}
			else {
				num=num-1;
			}
			steps++;
		}
		
		return steps;
	}
}
