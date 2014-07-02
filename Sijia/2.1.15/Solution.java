public class Solution {
    public void rotate(int[][] matrix) {
    	int N=matrix.length;
    	/* horizontal flip*/
    	for(int r=0; r < N; r++){
    		for(int c=0; c< N/2; c++){
    			int temp = matrix[r][c];
    			matrix[r][c]=matrix[r][N-1-c];
    			matrix[r][N-1-c]=temp;
    		}
    	}

    	/* diagonal flip*/
    	for(int r=0; r < N-1; r++){
    		for(int c=0; c< N-1-r; c++){
    			int temp = matrix[r][c];
    			matrix[r][c]=matrix[N-1-c][N-1-r];
    			matrix[N-1-c][N-1-r]=temp;
    		}
    	}
    }

}