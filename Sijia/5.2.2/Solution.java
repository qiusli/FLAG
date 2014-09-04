public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len=inorder.length;
    	return buildTree(inorder,postorder,0,len-1,0,len-1);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder, int is, int ie, int ps, int pe){
    	if (ps < pe) {
			TreeNode root = new TreeNode(postorder[pe]);
			int par=-1;
			for (int i = is; i <= ie; i++) {
				if (inorder[i]==postorder[pe]) {
					par = i;
					break;
				}
			}
			root.left = buildTree(inorder,postorder, is, par-1, ps , par-is+ps-1);
			root.right = buildTree(inorder,postorder, par+1, ie, par-is+ps, pe-1);
			return root;	
		}
		else if(ps == pe){
			TreeNode root = new TreeNode(postorder[pe]);
			root.left=null;
			root.right=null;
			return root;
		}
		else{
			return null;
		}
	}
}