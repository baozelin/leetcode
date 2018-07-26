package 递归;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class BinaryTreePreorderTraversal__144 {
	
	/**
	 * recursive
	 */
	  
	  public List<Integer> preorderTraversal(TreeNode root) {
		    List<Integer> result = new LinkedList<>();
		    preorder(root,result);
		    return result;
		}

		private void preorder(TreeNode n, List<Integer> ret){
		    if(n != null) {
		    	ret.add(n.val);
		    	preorder(n.left, ret);
		    	preorder(n.right, ret);
		    }   
		}
	  
	  /**
	   * 
	   * iterative
	   */
	  public List<Integer> preorderTraversal2(TreeNode root) {
	        List<Integer> result = new LinkedList<Integer>();
	        if (root == null) {
	            return result;
	        }
	        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	        stack.push(root);
	        while (!stack.isEmpty()) {
	            TreeNode top = stack.pop();
	            if (top != null) {
	                result.add(top.val);
	                stack.push(top.right);
	                stack.push(top.left);
	            }
	        }
	        return result;
	    }
	  
	  
	  public static void main(String[]arg) {
		  BinaryTreePreorderTraversal__144 t = new BinaryTreePreorderTraversal__144();
		 // LinkedList<TreeNode> stack = new LinkedList<TreeNode>{1.null,2,3};
			// t.preorderTraversal2(S);
		 }
	  
	 
	  private class TreeNode {
			 int val;
			 TreeNode left;
			 TreeNode right;
			 TreeNode(int x) { val = x; }
		  }  
	  
	  
	  
}
