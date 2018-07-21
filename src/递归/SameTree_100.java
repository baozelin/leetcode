package 递归;

public class SameTree_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
	    if(p == null && q == null) return true;
	    else if(p != null && q == null) return false;    
	        
	    else if(p == null && q != null) return false;  
	     
	    if(p.val != q.val) return false;    
	    
	    else{
	        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
	    }	        
	}
	
	 private class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	  }  
}
