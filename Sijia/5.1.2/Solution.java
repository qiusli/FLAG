public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Stack<List<Integer>> lists=new Stack();
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
			lists.push(list);
			Q = getNextQ(Q);
		}
		
		List<List<Integer>> res=new ArrayList();
		while(!lists.isEmpty()){
			res.add(lists.pop());
		}
		return res;
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