package BinarySearch;

public class BoyGirl {

	public static void main(String[] args) {
		int[] students  = {1,1,1,0,0,0};
		System.out.println(search(students));

	}
	
	public static int search(int[] students) {
		int start=0;
		int end=students.length-1;
		
		
		
		while(start<end) {
			int mid =  start + (end-start)/2;
			if(students[mid]==0) {
				end=mid;
			}
			else {
				start=mid +1;
			}
		}
		
		return end;
	}
	
	
	

}
