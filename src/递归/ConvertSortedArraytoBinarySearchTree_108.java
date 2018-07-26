package 递归;

public class ConvertSortedArraytoBinarySearchTree_108 {
	 public TreeNode sortedArrayToBST(int[] nums) {
	        TreeNode root = bst(nums, 0, nums.length - 1);
	        return root;
	    }
	    private TreeNode bst(int[] nums, int l, int r){
	        if(l>r) return null;
	        
	        else{
	        int mid  = l + (r - l)/2;
	        TreeNode node = new TreeNode(nums[mid]);
	        node.left = bst(nums, l, mid-1);
	        node.right = bst(nums, mid+1, r);
	        return node;
	        }	        
	    }
	
	private class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	  }  
}
