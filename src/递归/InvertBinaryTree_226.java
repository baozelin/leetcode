package 递归;

public class InvertBinaryTree_226 {
	public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
            
        else{
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
            return root;
        }
    }
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	  }  
}
