public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int r=matrix.length;
        int c=matrix[0].length;
        return search(matrix, getIndex(matrix, 0,0), getIndex(matrix,r-1,c-1), target);
    }
    public boolean search(int[][] matrix, int start, int end, int target){
    	int c=matrix[0].length;
    	if(start<=end){
    		int mid=(start+end)/2;
    		if(matrix[mid/c][mid%c]==target) return true;
    		else if(matrix[mid/c][mid%c]>target){
    			return search(matrix, start, mid-1, target);
    		}else{
    			return search(matrix, mid+1, end, target);
    		}
    	}
    	return false;
    }
    public int getIndex(int[][] matrix, int i, int j){
    	int c=matrix[0].length;
    	return c*i+j;	
    }
}