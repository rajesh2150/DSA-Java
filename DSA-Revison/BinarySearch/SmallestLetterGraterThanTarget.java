package BinarySearch;

public class SmallestLetterGraterThanTarget {

	public static void main(String[] args) {
	char[] letters = {'c','f','j'};
	char target = 'a';

	System.out.println(nextGreatestLetter(letters, target));
	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
		
		
		for(int i=0;i<letters.length;i++) {
			int ch = letters[i];
			
			if(ch > (int) target) {
				return letters[i];
			}
		}
		
		
		return letters[0];
        
    }

}
