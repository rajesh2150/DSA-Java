package TwoDArrays;

public class ObtainedByRotation {

	public static void main(String[] args) {
		int[][] mat = {
			    {0, 0, 0},
			    {0, 1, 0},
			    {1, 1, 1}
			};

			int[][] target = {
			    {1, 1, 1},
			    {0, 1, 0},
			    {0, 0, 0}
			};

//			System.out.println(findRotation(mat, target));
			System.out.println(optimal(mat, target));
			
		
			

	}
	
	public static boolean findRotation(int[][] mat, int[][] target) {
       
       

     for(int i=0;i<4;i++) {
    	 if(isSame(mat,target)) return true;
    	 else {
    		 mat=rotate(mat);
    	 }
     }
        
        
       
   
        

        
        return false;
    }
	
	public static boolean isSame(int[][] mat, int[][] target) {
	
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
					
				if(mat[i][j] != target[i][j]) return false;
			}
		}
		return true;
	}

	public static int[][] rotate(int[][] mat){
		 int row=mat.length;
	        int col=mat[0].length;
		 int[][] temp=new int[row][col];
		 for(int i=0;i<mat.length;i++) {
	        	for(int j=mat[i].length-1;j>=0;j--) {
	        		
//	        		System.out.print(j+""+i+"  ");
	        		temp[j][row-i-1]=mat[i][j];
	        	}
	        	
//	        	System.out.println();   
	        }
		 
		 return temp;
	}
	
	//================== Optimal===
	
	public static boolean optimal(int[][] mat,int[][] target) {
		for(int i=0;i<4;i++) {
	    	 if(isSame(mat,target)) return true;
	    	 else {
	    		 transpose(mat);
	    		for(int j=0;j<mat.length;j++) {
	    			reverse(mat[j]);
	    		}
	    	 }
	     }
		
		return false;
		
	}
	
	public static void transpose(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=i+1;j<mat[0].length;j++) {
				int temp=mat[j][i];
				mat[j][i]=mat[i][j];
				mat[i][j]=temp;
			}
		}		
		
		print(mat);
		System.out.println("-------");
	}

	public static void reverse(int[] arr) {
		int start=0;
		int end = arr.length-1;
		
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
	}
	
	public static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
					
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
