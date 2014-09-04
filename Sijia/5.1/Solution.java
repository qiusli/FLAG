public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> lists = new ArrayList();
		ArrayList<Integer> list = null;
		Queue<TreeNode> Q = new LinkedList<TreeNode>();

		if (root == null)
			return lists;

		Q.add(root);
		while (!Q.isEmpty()) {
			list = new ArrayList<Integer>();
			Iterator<TreeNode> it = Q.iterator();
		

			while (it.hasNext()) {
				TreeNode cur = (TreeNode) it.next();
					list.add(cur.val);

			}
			lists.add(list);
			Q = getNextQ(Q);
		}
		return lists;
	}

	public Queue<TreeNode> getNextQ(Queue<TreeNode> Q) {
		Queue<TreeNode> retQ = new LinkedList<TreeNode>();
		while (!Q.isEmpty()) {
			TreeNode cur = Q.remove();
			if (cur.left != null) {
				retQ.add(cur.left);
			}
			if (cur.right != null) {
				retQ.add(cur.right);
			}
		}
		return retQ;
	}
}