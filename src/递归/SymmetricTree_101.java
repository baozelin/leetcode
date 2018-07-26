package 递归;


public class SymmetricTree_101 {
	 public boolean isSymmetric(TreeNode root) {
	        if(root == null) return true;
	        return sym(root.left, root.right);
	    }
	    
	    private boolean sym(TreeNode n1, TreeNode n2){
	        if(n1 == null && n2 == null) return true;
	        else if(n1 != null && n2 == null) return false;
	        else if(n1 == null && n2 != null) return false;
	        else if(n1.val != n2.val) return false;
	        else return sym(n1.left, n2.right) && sym(n1.right, n2.left);
	    }
	    private class TreeNode {
			 int val;
			 TreeNode left;
			 TreeNode right;
			 TreeNode(int x) { val = x; }
		  }  
}
