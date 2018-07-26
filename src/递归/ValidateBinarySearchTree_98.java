package 递归;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree_98 {
	
	/**
	 * 中序遍历写法, left < root. roo < rigt
	 * @param root
	 * @return
	 */
	public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        for(int i = 0; i< list.size()-1; i++){
           if(list.get(i) >= list.get(i+1)) return false; 
        }
        return true;

    }
    private void inorder(TreeNode n, List<Integer> ret){
		    if(n != null) {
		    	inorder(n.left, ret);
                ret.add(n.val);
		    	inorder(n.right, ret);
		    }   
		}
	
	
	
	/**
	 * 中序遍历写法，不需要额外的O(n)的空间
	 */
	TreeNode pre = null;
    
    public boolean isValidBST2(TreeNode root) {
        // Traverse the tree in inorder.
        if (root != null) {
            // Inorder traversal: left first.
            if (!isValidBST(root.left)) return false;
            
            // Compare it with the previous value in inorder traversal.
            if (pre != null && root.val <= pre.val) return false;
            
            // Update the previous value.
            pre = root;
            
            // Inorder traversal: right last.
            return isValidBST(root.right);
        }
        return true;
     }
    
    
    private class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	  }  
 

}
