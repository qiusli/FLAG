public class Solution {
	public void recoverTree(TreeNode root) {
		// find the one smaller than prev one
		TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
		List<TreeNode> lt=new ArrayList<TreeNode>();
		Stack<TreeNode> st = new Stack();
		TreeNode cur = root;

		while (true) {
			if (cur != null) {
				st.push(cur);
				cur = cur.left;
			} else {
				if (st.isEmpty()) {
					break;
				} else {
					cur = st.pop();
					if(cur.val<preNode.val){
						lt.add(preNode);
						lt.add(cur);
					}
					preNode=cur;
					cur=cur.right;
				}
			}
		}
		
		swap((TreeNode)lt.get(0), (TreeNode)lt.get(lt.size()-1));
	}
	public void swap(TreeNode n1, TreeNode n2) {
		int temp = 0;
		temp = n1.val;
		n1.val = n2.val;
		n2.val = temp;
	}
}