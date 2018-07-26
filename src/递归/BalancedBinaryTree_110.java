package 递归;



public class BalancedBinaryTree_110 {
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(depth(root.left) - depth(root.right)) > 1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    
    private int depth(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(depth(root.left),depth(root.right));
    }
    
    private class TreeNode {
   	 int val;
   	 TreeNode left;
   	 TreeNode right;
   	 TreeNode(int x) { val = x; }
     }  
}
