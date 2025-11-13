package TwoDArrays;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1,3,5,4},
						{4,6,7,8},
						{8,9,10,2},
						{12,34,5,6}
					};
		System.out.println(diagonalSum(arr));

	}
	
	public static int diagonalSum(int[][] mat) {
        int sum=0;
        
        for(int dig=0;dig<mat.length;dig++) {
        	sum += mat[dig][dig];
        	
        }
        
        int j=mat.length-1;
        
        for(int i=0;i<mat.length;i++) {
        	
        	
        	sum += mat[i][j--];
        }
        
        if(mat.length%2!=0) {
        	sum = sum - mat[mat.length/2][mat.length/2];
        }
        return sum;
    }

}
