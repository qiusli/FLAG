public class Solution {
    public int[] searchRange(int[] A, int target) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		min=searchMin(target, A, 0, A.length-1, min);
		max=searchMax(target, A, 0, A.length-1, max);
		if(min==Integer.MAX_VALUE && max== Integer.MIN_VALUE) return new int[]{-1,-1};
		return new int[]{min,max}; 
    }
    public int searchMin(int target, int[] A, int start, int end, int min){
    	if(start<=end){
    		int mid=(start+end)/2;
    		if(A[mid]==target){
    			min=Math.min(mid, searchMin(target, A, 0, mid-1,min) );
    		}
    		else if(A[mid]<target){
    			return searchMin(target, A, mid+1, end, min);
    			}
    		else{
    			return searchMin(target, A, 0, mid-1,min);
    		}
    	}
    	return min;
    }
    public int searchMax(int target, int[] A, int start, int end, int max){
    	if(start<=end){
    		int mid=(start+end)/2;
    		if(A[mid]==target){
    			max=Math.max(mid, searchMax(target, A,  mid+1, end ,max) );
    		}
    		else if(A[mid]<target){
    			return searchMax(target, A, mid+1, end, max);
    			}
    		else{
    			return searchMax(target, A, 0, mid-1,max);
    		}
    	}
    	return max;
    }
}