package Arrays;

import java.util.Arrays;

public class CheckIfPangram {

	public static void main(String[] args) {
		
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));

	}
	
	 public static boolean checkIfPangram(String sentence) {
	        int[] freq = new int[26];
	        

	        if(sentence.length()<26) {
	        	return false;
	        	
	        }
	        for(int i=0;i<sentence.length();i++){
	            char ch = sentence.charAt(i);
	            int index = ch-'a';
	            freq[index]++;
	        }
	        
//	        System.out.println(Arrays.toString(freq));
	        
	        for(int i=0;i<freq.length;i++) {
	        	if(freq[i]==0) {
	        		return false;
	        	}
	        }
	        
	        return true;
	    }

}
