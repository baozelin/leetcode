package 递归;



public class PathSum_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
  
        if(root.left == null && root.right == null && root.val == sum ) return true;
        
       // if(root  sum != 0) return false;
        
        int tmp = sum - root.val;
        return hasPathSum(root.left, tmp) || hasPathSum(root.right, tmp);
              
    }
	private class TreeNode {
	   	 int val;
	   	 TreeNode left;
	   	 TreeNode right;
	   	 TreeNode(int x) { val = x; }
	}
}
