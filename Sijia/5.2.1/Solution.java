public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int len = preorder.length;
		return buildTree(preorder, inorder, 0, len - 1, 0, len - 1);
	}

	public TreeNode buildTree(int[] preorder, int[] inorder, int ps, int pe,
			int is, int ie) {

		if (ps < pe) {
			TreeNode root = new TreeNode(preorder[ps]);
			int par=-1;
			for (int i = is; i <= ie; i++) {
				if (inorder[i] == preorder[ps]) {
					par = i;
					break;
				}
			}
			root.left = buildTree(preorder, inorder, ps + 1,  ps+par-is, is, par - 1);
			root.right = buildTree(preorder, inorder, ps+par-is+1 , pe, par + 1, ie);
			return root;	
		}
		else if(ps == pe){
			TreeNode root = new TreeNode(preorder[ps]);
			root.left=null;
			root.right=null;
			return root;
		}
		else{
			return null;
		}
	}
}