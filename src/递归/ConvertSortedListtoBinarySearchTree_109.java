package 递归;


public class ConvertSortedListtoBinarySearchTree_109 {
	public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode tmp = head;
        int size = 0;
        while(tmp != null) {
            size++;
            tmp = tmp.next;
        }
        int[] list = new int[size];
        int i = 0;
        tmp = head;
        while(tmp !=null) {
            list[i] = tmp.val;
            i++;
            tmp = tmp.next;
        }
        return toBST(list, 0, size -1);
    }
        
    private TreeNode toBST(int[] nums, int l, int r){
        if(l <= r){
            int mid = l + (r - l)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = toBST(nums, l, mid -1);
            node.right = toBST(nums, mid + 1, r);
            return node;
        }
        else {return null;}
    }
    private class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	  }  
    
    public class ListNode {
    	    int val;
    	      ListNode next;
    	    ListNode(int x) { val = x; }
    	  }
}
