public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		Stack<TreeNode> sp = new Stack();
		Stack<TreeNode> sq = new Stack();
		TreeNode pcur = p;
		TreeNode qcur = q;

		if (pcur != null && qcur != null) {
			while (true) {
				if (pcur != null && qcur != null) {
					while (pcur != null && qcur != null) {
						sp.push(pcur);
						sq.push(qcur);
						pcur = pcur.left;
						qcur = qcur.left;
					}
				} else if (pcur == null && qcur == null) {

				} else {
					return false;
				}
				if (!sp.isEmpty() && !sq.isEmpty()) {
					pcur = sp.pop();
					qcur = sq.pop();
					if (pcur.val != qcur.val) {
						return false;
					} else {
						pcur = pcur.right;
						qcur = qcur.right;
					}
				} else if (!sp.isEmpty() || !sq.isEmpty()) {
					return false;
				} else {
					return true;
				}
			}
		} else if (pcur != null || qcur != null) {
			return false;
		}
		return true;
	}
}