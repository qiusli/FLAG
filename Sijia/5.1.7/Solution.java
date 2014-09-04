public class Solution {
	public boolean isSymmetric(TreeNode root) {
		List<TreeNode> leftList = new ArrayList();
		List<TreeNode> rightList = new ArrayList();
		int len = 0;
		if (root == null)
			return true;
		if (root.left == null && root.right == null) {
			return true;
		} else if (root.left != null && root.right != null) {
			if (root.left.val != root.right.val) {
				return false;
			} else {
				TreeNode left = root.left;
				TreeNode right = root.right;
				leftList.add(left);
				rightList.add(right);
				while (true) {
					if (leftList.size() != rightList.size()) {
						return false;
					} else if (leftList.size() == 0) {
						return true;
					} else {
						len = leftList.size();
						List<TreeNode> ltemp = new ArrayList();
						List<TreeNode> rtemp = new ArrayList();
						for (int i = 0; i < len; i++) {
							TreeNode lc = leftList.get(i);
							TreeNode rc = rightList.get(i);
							if (lc != null && rc != null) {
								if (lc.val != rc.val) {
									return false;
								}
								ltemp.add(lc.left);
								ltemp.add(lc.right);
								rtemp.add(rc.right);
								rtemp.add(rc.left);
								continue;
							} else if (lc == null && rc == null) {
								continue;
							} else {
								return false;
							}
						}
						leftList = ltemp;
						rightList = rtemp;
					}
				}
			}
		} else {
			return false;
		}
	}
}