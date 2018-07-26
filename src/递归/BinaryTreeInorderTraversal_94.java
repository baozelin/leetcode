package 递归;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
	
	public List<Integer> inorderTraversal(TreeNode root) {
	    List<Integer> ret = new ArrayList<>();
	    inorder(root,ret);
	    return ret;
	}
	private void inorder(TreeNode n, List<Integer> ret){
	   if(n != null) {
		   inorder(n.left, ret);
		   ret.add(n.val);
		   inorder(n.right, ret);
	   }
	}
	
	/**
	 * iterative
	 */
	public List<Integer> inorderTraversal2(TreeNode root){
		
		List<Integer> ret = new ArrayList<Integer>();
		if(root == null) return ret;
		
		TreeNode curr = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(curr != null || !stack.isEmpty()) {
			while(curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop();
			ret.add(curr.val);
			curr = curr.right;
		}
		return ret;	
	}
	
	
	private class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	  }
}
