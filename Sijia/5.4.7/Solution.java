public class Solution {
	public int sumNumbers(TreeNode root) {
		if(root==null) return 0;
		return findPath(root, "");
	}
	public int findPath(TreeNode root, String str){
		String curStr=String.valueOf(root.val);
		curStr=str+curStr;
		if(root.left!=null && root.right!=null){
			return findPath(root.left, curStr)+findPath(root.right, curStr);
		}else{
			if(root.left==null && root.right==null){
				int temp=Integer.parseInt(curStr);
				return temp;
			}else if(root.left==null){
				return findPath(root.right, curStr);
			}else{
				return findPath(root.left, curStr);
			}
		}	
	}
}