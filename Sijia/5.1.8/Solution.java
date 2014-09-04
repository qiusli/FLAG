public class Solution {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (root.left == null && root.right == null)
			return true;

		boolean ret = checkNode(root);
		return ret;
	}

	public boolean checkNode(TreeNode root) {
		if (root.left != null && root.right != null) {
			if(Math.abs(depth(root.left)-depth(root.right))>1) return false;
			return checkNode(root.left) & checkNode(root.right);
		}
		else if(root.left!=null || root.right!=null){
			if(depth(root)>1) return false;
			else return true;
		}
		else{
			return true;
		}
	}

	public int depth(TreeNode root) {
		if (root.left != null || root.right != null) {
			if (root.left != null && root.right != null) {
				return Math.max(depth(root.left) + 1, depth(root.right) + 1);
			} else if (root.left == null) {
				return depth(root.right) + 1;
			} else {
				return depth(root.left) + 1;
			}
		} else {
			return 0;
		}
	}
}