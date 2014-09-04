public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		return hasSum(root, sum, root.val);
	}

	public boolean hasSum(TreeNode root, int sum, int currentSum) {
		if (root.left != null && root.right != null) {
			return hasSum(root.left, sum, currentSum+root.left.val)
					| hasSum(root.right, sum, currentSum+root.right.val);
		} else {
			if (root.left == null && root.right == null) {
				if (currentSum == sum)
					return true;
				else
					return false;
			} else if (root.left == null) {
				return hasSum(root.right, sum, currentSum+root.right.val);
			} else {
				return hasSum(root.left, sum, currentSum+root.left.val);
			}

		}
	}
}