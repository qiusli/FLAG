public class Solution {
	public void connect(TreeLinkNode root) {
		if (root != null) {
			ArrayList<TreeLinkNode> al = new ArrayList<TreeLinkNode>();
			al.add(root);
			
			while (!al.isEmpty()) {
				ArrayList<TreeLinkNode> curlist = new ArrayList<TreeLinkNode>();
				Iterator it = al.iterator();
				while (it.hasNext()) {
					TreeLinkNode cur = (TreeLinkNode) it.next();
					if (cur.left != null) {
						curlist.add(cur.left);
					}
					if (cur.right != null) {
						curlist.add(cur.right);
					}
				}

				// iterate curlist
				Iterator it2 = curlist.iterator();
				TreeLinkNode pre=null;
				TreeLinkNode cur=null;
				if(it2.hasNext()){
					pre = (TreeLinkNode) it2.next();
				}
				while (it2.hasNext()) {
					cur = (TreeLinkNode) it2.next();
					pre.next = cur;
					pre = cur;
				}
				al = curlist;
			}
		}
	}
}