package TwoDArrays;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board1 = {
			    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
			};
		
		char[][] board = {
			    {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
			    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
			};


		System.out.println(isValidSudoku(board1));

	}

	 public static boolean isValidSudoku(char[][] board) {
	        
		 for(int i=0;i<9;i++) {
			 Map<Character,Integer> map = new HashMap<>();
			 for(int j=0;j<9;j++) {
				 char ch = board[i][j];
				 if(map.containsKey(ch)) return false;
				 
				 if(Character.isLetterOrDigit(ch)) {
					 map.put(ch, 1);
				 }
 
			 }
			 
			 Map<Character,Integer> col = new HashMap<>();
			 for(int j=0;j<9;j++) {
				 char ch = board[j][i];
				 if(col.containsKey(ch)) return false;
				 
				 if(Character.isLetterOrDigit(ch)) {
					 col.put(ch, 1);
				 }
 
			 }
			 
		
			
		 }
		 
		 // 3X3 check
		 
		 for(int i=0;i<9;i+=3) {
			 for(int j=0;j<9;j+=3) {
				 Map<Character,Integer> map = new HashMap<>();
				 
				 for(int k=0;k<3;k++) {
					 for(int l=0;l<3;l++) {
						 char ch = board[i+k][j+l];
						 if(ch !='.') {
							 if(map.containsKey(ch)) return false;
							 map.put(ch, 1);
						 }
					 }
					 
				 }
			 }
			
		 }
		 
		 return true;
		 
	    }
}
