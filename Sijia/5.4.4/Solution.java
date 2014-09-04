public class Solution {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> lists = new ArrayList();
		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return lists;
		getList(root, sum, root.val, list, lists);
		return lists;
	}

	public void getList(TreeNode root, int sum, int currentSum,
			List<Integer> list, List<List<Integer>> lists) {
		List<Integer> curlist = new ArrayList();
		curlist.addAll(list);
		curlist.add(root.val);
		if (root.left != null && root.right != null) {
			getList(root.left, sum, currentSum + root.left.val, curlist, lists);
			getList(root.right, sum, currentSum + root.right.val, curlist, lists);
		} else {
			if (root.left == null && root.right == null) {
				if (currentSum == sum) {
					lists.add(curlist);
				}
			} else if (root.left == null) {
				getList(root.right, sum, currentSum + root.right.val, curlist,
						lists);
			} else {
				getList(root.left, sum, currentSum + root.left.val, curlist,
						lists);
			}
		}
	}
}