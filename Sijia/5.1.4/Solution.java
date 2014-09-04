public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList();
		Stack<TreeNode> st = new Stack();
		if (root == null)
			return list;
		TreeNode cur = root;
		st.add(root);

		while(true){
			while (cur.left!=null) {
				cur = cur.left;
				st.push(cur);
			}
			cur=st.pop();
			cur.left=null;
			list.add(cur.val);
			if(cur.right!=null){
				cur=cur.right;
				st.push(cur);
			}					
			if(st.isEmpty())break;
		}
		return list;
	}
}