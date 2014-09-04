public class Solution {
	public boolean isValidBST(TreeNode root) {
		boolean ret = true;
		if (root == null)
			return true;
		ret = checkSmall(root.left, root.val)
				& checkLarge(root.right, root.val);
		if (root.left != null)
			ret = ret & isValidBST(root.left);
		if (root.right != null)
			ret = ret & isValidBST(root.right);
		return ret;
	}

	public boolean checkSmall(TreeNode root, int val) {
		boolean ret=true;
		if (root != null) {
			if (root.val >= val) return false;
			if (root.left != null) {
				 ret=ret & checkSmall(root.left, val);
			}
			if (root.right != null) {
				ret=ret & checkSmall(root.right, val);
			}
		}
		return ret;
	}

	public boolean checkLarge(TreeNode root, int val) {
		boolean ret=true;
		if (root != null) {
			if (root.val <= val)
				return false;
			if (root.left != null) {
				 ret=ret &  checkLarge(root.left, val);
			}
			if (root.right != null) {
				 ret=ret &  checkLarge(root.right, val);
			}
		}
		return ret;
	}
}