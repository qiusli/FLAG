public class Solution {
	public int maxDepth(TreeNode root) {	
		if(root==null) return 0;
		return count(1, root);
	}

	public int count(int value, TreeNode root) {
		if (root.left != null && root.right != null) {
			return Math.max(count(value + 1, root.left),
					count(value + 1, root.right));
		} else {
			if (root.left == null && root.right == null) {
				return value;
			}else if(root.left==null){
				return count(value+1, root.right);
			}else{
				return count(value+1, root.left);
			}
		}
	}
}