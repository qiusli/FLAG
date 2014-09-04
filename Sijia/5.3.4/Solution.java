public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
    	int len=num.length;
    	return convert(num, 0, len-1);
    }
    public TreeNode convert(int[] num, int start, int end){
    	if(start<end){
        	int mid=(start+end)/2;
        	TreeNode root= new TreeNode(num[mid]);
        	root.left=convert(num, start, mid-1);
        	root.right=convert(num, mid+1, end);
        	return root;
    	}
    	else if(start==end ){
    		return new TreeNode(num[start]);
    	}else{
    		return null;
    	}
    }
}