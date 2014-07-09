public class Solution {
    public int singleNumber(int[] A) {
        int len=A.length;
        int singleElement=0;
        for(int i=0;i<len;i++){
        	singleElement^=A[i];
        }
    	return singleElement;
    }
}