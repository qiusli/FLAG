public class Solution {
    public int searchInsert(int[] A, int target) {
    	int len=A.length;
    	int i=0;
    	for(i=0; i< len; i++){
    		if(A[i]>=target){
    			break;
    		}
    	}
    	return i;
    }
}